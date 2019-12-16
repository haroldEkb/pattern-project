package com.harold.service;

import com.harold.entities.Report;
import com.harold.entities.User;

public class ReportService {
    public Report getReportByUser(User user){
        return new Report(user, "test report");
    }

    public void sendReport(Report report) {
        //Отсылает отчет в виде уведомления на сайте/клиенте
    }
}
