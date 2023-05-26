package com.scaler.lld.designpatterns.adapter;

import java.util.List;

public class ApplicationCode {
    ILogger logger = LoggerFactory.getLoggerFromName("log4j");

    Slo4JAdapter adapter = new Slo4JAdapter();
//    List<PaymentGW>


    public ApplicationCode() {
    }



    void doSomething() {
        // .....

        // .....

        logger.log("Hey there");


    }
}


// Many Logging libraries:
// - Log4J => sendStream()
// - Logger => printLog()
// - Slo4j => out()