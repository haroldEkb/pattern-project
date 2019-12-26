package com.harold.utils;

import com.harold.entities.Report;
import com.harold.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;

public class SMSDecorator extends BaseDecorator {
    @Autowired
    private SMSService smsService;

    public SMSDecorator(Notificator notificator) {
        super(notificator);
    }

    @Override
    public void send(Report report) {
        super.send(report);
        smsService.sendSms(report);
    }
}
