package com.harold.service;

import com.harold.entities.Report;

public class SMSService {

    public void sendSms(Report report) {
        String phone = report.getUser().getPhone();
        //Отправляет отчет в втде смс сообщения
    }
}
