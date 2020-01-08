package com.hkk.webdemo.task;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(fixedDelay = 1000 * 60 * 10)
    public void fixedRateTest() {
        LOG.info("fixedRateTest execute " + DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
    }


}
