package com.harold.controller;

import com.harold.entities.Record;
import com.harold.entities.User;
import com.harold.service.RecordService;
import com.harold.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private RecordService recordService;

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }

    @GetMapping ("/personalPage")
    public String login(@RequestParam(name = "userId") Integer userId, Model model){
        List<Record> records = recordService.findAll(userId);
        model.addAttribute("records", records);
        return "personal-page";
    }
}
