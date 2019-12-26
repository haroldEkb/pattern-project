package com.harold.strategy;

import com.harold.entities.Record;
import com.harold.entities.Report;

import java.util.List;

public interface ReportStrategy {
    Report compileReport(List<Record> records);
}
