package com.harold.service;

import com.harold.builder.Director;
import com.harold.entities.Report;
import com.harold.repository.DBManager;
import com.harold.repository.UserRepositoryImpl;
import com.harold.strategy.AdvancedReportStrategy;
import com.harold.strategy.BasicReportStrategy;
import com.harold.strategy.ProReportStrategy;
import com.harold.entities.User;
import com.harold.repository.UserRepository;
import com.harold.utils.DefaultNotificator;
import com.harold.utils.MailDecorator;
import com.harold.utils.Notificator;
import com.harold.utils.SMSDecorator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserService {
    @Autowired
    private RecordService recordService;

    @Autowired
    private ReportService reportService;

    @Autowired
    private Director director;

    private UserRepository userRepository;

    @PostConstruct
    private void init(){
        DBManager.createUserTable();
        userRepository = new UserRepositoryImpl(DBManager.getSessionFactory());
    }

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
  
    public void sendMonthlyReport(User user){
        Notificator notificator = new DefaultNotificator();
        if (user.getPhone() != null) notificator = new SMSDecorator(notificator);
        if (user.getEmail() != null) notificator = new MailDecorator(notificator);
        notificator.send(reportService.getReportByUser(user));
    }

    @PreDestroy
    private void destroy(){
        userRepository.close();
        DBManager.dropUserTable();
    }
}
