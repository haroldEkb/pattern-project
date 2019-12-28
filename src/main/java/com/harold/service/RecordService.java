package com.harold.service;

import com.harold.builder.Director;
import com.harold.builder.RecordBuilder;
import com.harold.builder.RecordBuilderImpl;
import com.harold.entities.Record;
import com.harold.repository.RecordRepository;
import com.harold.utils.SimpleRecord;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecordService {
    @Autowired
    private Director director;

    @Autowired
    private RecordRepository recordRepository;

    public List<Record> findAll(Integer id){
        return recordRepository.findAllByUserId(id);
    }

    public void addRecord(SimpleRecord simpleRecord, String mode) {
        if (!director.isBuilderAssigned()){
            director.setRecordBuilder(new RecordBuilderImpl());
        }
        director.addRecord(simpleRecord, mode);
        recordRepository.save(director.getResult());
    }
}
