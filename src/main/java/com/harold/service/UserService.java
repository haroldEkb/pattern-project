package com.harold.service;

import com.harold.builder.Director;
import com.harold.entities.Report;
import com.harold.entities.User;
import com.harold.repository.UserRepository;
import com.harold.strategy.AdvancedReportStrategy;
import com.harold.strategy.BasicReportStrategy;
import com.harold.strategy.ProReportStrategy;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private RecordService recordService;

    @Autowired
    private ReportService reportService;

    @Autowired
    private Director director;

    @Autowired
    private UserRepository userRepository;

    public void addSomeRecord(){
        director.addRecord("default");
        recordService.saveRecord();
    }

    public Report getReport(User user){
        if (user.getSubscribe() == User.Subscribe.BASIC) return reportService.getReport(user, new BasicReportStrategy());
        if (user.getSubscribe() == User.Subscribe.ADVANCED) return reportService.getReport(user, new AdvancedReportStrategy());
        if (user.getSubscribe() == User.Subscribe.PRO) return reportService.getReport(user, new ProReportStrategy());
        else return null;
    }
}
