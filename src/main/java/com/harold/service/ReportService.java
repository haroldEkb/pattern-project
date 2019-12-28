package com.harold.service;

import com.harold.entities.Report;
import com.harold.entities.User;
import com.harold.strategy.ReportStrategy;

import java.util.ArrayList;


public class ReportService {

    public Report getReport(User user, ReportStrategy strategy){
        Report report = strategy.compileReport(user.getRecords());
        report.setUserId(user.getId());
        return report;
    }

    public Report getReportByUser(User user){
        return new Report(user, new ArrayList<String>());
    }

    public void sendReport(Report report) {
        //Отсылает отчет в виде уведомления на сайте/клиенте
    }
}
