package com.harold.controller;

import com.harold.builder.Director;
import com.harold.service.RecordService;
import com.harold.utils.SimpleRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RecordController {
    @Autowired
    private RecordService recordService;

    @PostMapping("/add")
    public String addRecord(@RequestBody SimpleRecord simpleRecord, Model model){
        recordService.addRecord(simpleRecord, "default");
        return "redirect:/personal-page";
    }
}
