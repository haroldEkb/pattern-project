package com.harold.builder;

import com.harold.entities.Record;

import java.time.LocalDate;

public interface RecordBuilder {
    RecordBuilder reset();
    RecordBuilder setUserId(Integer userId);
    RecordBuilder setCategory(String category);
    RecordBuilder setLocation(String location);
    RecordBuilder setSum(Double sum);
    RecordBuilder setData(LocalDate date);
    Record getResult();
}
