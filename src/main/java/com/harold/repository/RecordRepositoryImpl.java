package com.harold.repository;

import com.harold.entities.Record;

import java.util.ArrayList;
import java.util.List;

public class RecordRepositoryImpl implements RecordRepository {
    @Override
    public Record findOneByUserId(Integer id) {
        return null;
    }

    @Override
    public List<Record> findAllByUserId(Integer id) {
        return new ArrayList<Record>();
    }

    @Override
    public void save(Record record) {
    }
}
