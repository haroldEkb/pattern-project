package com.harold.repository;

import com.harold.entities.Record;

import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository  {
    Record findOneByUserId(Integer id);
    List<Record> findAllByUserId(Integer id);
    void save(Record record);
}
