package com.harold.service;

import com.harold.builder.Director;
import com.harold.entities.User;
import com.harold.repository.UserRepository;
import com.harold.utils.DefaultNotificator;
import com.harold.utils.MailDecorator;
import com.harold.utils.Notificator;
import com.harold.utils.SMSDecorator;
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

    public void sendMonthlyReport(User user){
        Notificator notificator = new DefaultNotificator();
        if (user.getPhone() != null) notificator = new SMSDecorator(notificator);
        if (user.getEmail() != null) notificator = new MailDecorator(notificator);
        notificator.send(reportService.getReportByUser(user));
    }
}
