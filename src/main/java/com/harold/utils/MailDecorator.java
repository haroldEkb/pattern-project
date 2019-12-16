package com.harold.utils;

import com.harold.entities.Report;

public class MailDecorator extends BaseDecorator {

    public MailDecorator(Notificator notificator) {
        super(notificator);
    }

    @Override
    public void send(Report report) {
        super.send(report);
    }
}
