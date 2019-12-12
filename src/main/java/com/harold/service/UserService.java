package com.harold.service;

import com.harold.builder.Director;
import com.harold.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private RecordService recordService;

    @Autowired
    private Director director;

    @Autowired
    private UserRepository userRepository;

    public void addSomeRecord(){
        director.addRecord("default");
        recordService.saveRecord();
    }
}
