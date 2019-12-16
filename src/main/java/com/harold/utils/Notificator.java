package com.harold.utils;

import com.harold.entities.Report;
import com.harold.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;

public interface Notificator {
    public void send(Report report);
}
