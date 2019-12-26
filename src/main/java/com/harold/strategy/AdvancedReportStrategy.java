package com.harold.strategy;

import com.harold.entities.Record;
import com.harold.entities.Report;

import java.util.List;

public class AdvancedReportStrategy implements ReportStrategy {

    @Override
    public Report compileReport(List<Record> records) {
        //Продвинутый отчет должен содержать полезную инфографику и распределение по местам с наибольшими затратами
        return null;
    }
}
