package com.harold.strategy;

import com.harold.entities.Record;
import com.harold.entities.Report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicReportStrategy implements ReportStrategy {

    @Override
    public Report compileReport(List<Record> records) {
        Report report = new Report();
        List<String> reportStrings = new ArrayList<>();
        //Алгоритм требует доработки
        for (Record record : records) {
            reportStrings.add(record.getCategory() + " " + record.getSum());
        }
        report.setContent(reportStrings);
        return report;
    }
}
