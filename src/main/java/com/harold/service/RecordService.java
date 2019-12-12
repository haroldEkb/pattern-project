package com.harold.service;

import com.harold.builder.RecordBuilder;
import com.harold.builder.RecordBuilderImpl;
import com.harold.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RecordService {
    @Autowired
    private RecordBuilder recordBuilder;

    @Autowired
    private RecordRepository recordRepository;

    public RecordBuilder getRecordBuilder(){
        return recordBuilder;
    }

    public void saveRecord(){
        recordBuilder.getResult();
        recordRepository.save();
    }
}
