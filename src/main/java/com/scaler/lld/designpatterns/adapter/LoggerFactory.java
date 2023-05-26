package com.scaler.lld.designpatterns.adapter;

public class LoggerFactory {

    public static ILogger getLoggerFromName(String name) {
        if (name.equals("log4j")) {
            return new Log4JAdapter();
        }

        return new Slo4JAdapter();
    }
}
