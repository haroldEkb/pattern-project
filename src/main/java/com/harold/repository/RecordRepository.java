package com.harold.repository;

import com.harold.entities.Record;

public interface RecordRepository {
    Record findOneByUsername(String name);
}
