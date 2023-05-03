package com.scaler.lld.designpatterns.adapter;

import com.scaler.lld.designpatterns.adapter.thirdparty.log4j.Log4JSDK;

public class Log4JAdapter implements ILogger {
    private Log4JSDK log4J = new Log4JSDK();


    @Override
    public void log(String message) {
        log4J.sendStream(message);
    }
}
