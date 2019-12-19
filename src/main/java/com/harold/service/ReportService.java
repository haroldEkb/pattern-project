package com.harold.service;

import com.harold.entities.Report;
import com.harold.entities.User;
import com.harold.strategy.ReportStrategy;

public class ReportService {

    public Report getReport(User user, ReportStrategy strategy){
        Report report = strategy.compileReport(user.getRecords());
        report.setUserId(user.getId());
        return report;
    }
}
