package com.harold.utils;

import com.harold.entities.Report;

public class BaseDecorator implements Notificator {
    private Notificator notificator;

    @Override
    public void send(Report report) {
        notificator.send(report);
    }

    public BaseDecorator(Notificator notificator) {
        this.notificator = notificator;
    }
}
