package com.harold.utils;

import com.harold.entities.Report;
import com.harold.service.MailService;
import com.harold.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultNotificator implements Notificator {
    @Autowired
    private ReportService reportService;

    @Override
    public void send(Report report){
        reportService.sendReport(report);
    }
}
