package com.harold.builder;

import com.harold.entities.Record;

import java.time.LocalDate;

public class RecordBuilderImpl implements RecordBuilder {
    private Record resultRecord;

    public RecordBuilderImpl reset() {
        resultRecord = new Record();
        return this;
    }

    @Override
    public RecordBuilderImpl setUserId(Integer userId) {
        resultRecord.setUserId(userId);
        return this;
    }

    @Override
    public RecordBuilderImpl setCategory(String category) {
        resultRecord.setCategory(category);
        return this;
    }

    @Override
    public RecordBuilderImpl setLocation(String location) {
        resultRecord.setLocation(location);
        return this;
    }

    @Override
    public RecordBuilderImpl setSum(Double sum) {
        resultRecord.setSum(sum);
        return this;
    }

    @Override
    public RecordBuilderImpl setData(LocalDate date) {
        resultRecord.setData(date);
        return this;
    }

    @Override
    public Record getResult() {
        return resultRecord;
    }

    public RecordBuilderImpl(){
        this.resultRecord = new Record();
    }
}
