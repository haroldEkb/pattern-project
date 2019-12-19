package com.harold.strategy;

import com.harold.entities.Record;
import com.harold.entities.Report;

import java.util.List;

public class ProReportStrategy implements ReportStrategy {

    @Override
    public Report compileReport(List<Record> records) {
        //Самый полный вид отчета с рекомендации по экономии и чем-нибудь еще полезным
        return null;
    }
}
