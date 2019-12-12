package com.harold.repository;

import com.harold.entities.Record;
//import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository  {
    Record findOneByUserId(Integer id);
    void save();
}
