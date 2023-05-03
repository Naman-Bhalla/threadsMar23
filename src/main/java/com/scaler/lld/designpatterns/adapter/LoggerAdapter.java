package com.scaler.lld.designpatterns.adapter;

import com.scaler.lld.designpatterns.adapter.thirdparty.logger.LoggerAPI;

public class LoggerAdapter implements ILogger {
    private LoggerAPI loggerAPI = new LoggerAPI();

    @Override
    public void log(String message) {
        loggerAPI.printLog(message.getBytes());
    }
}
