package com.hkk.webdemo.task;

import org.apache.commons.lang3.RandomUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(fixedDelay = 1000 * 10)
    public void fixedRateTest() {
        LOG.info("fixedRateTest execute " + DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        LOG.error("errorMsg");
        throw new RuntimeException();
    }

    @Scheduled(cron = "0/10 * * * * ?")
    public void cronTest() {
        LOG.info("cronTest execute " + DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        try {
            int sleepSecond = RandomUtils.nextInt(5000, 15000);
            LOG.info("sleep:" + sleepSecond);
            Thread.sleep(sleepSecond);
        } catch (InterruptedException e) {
            LOG.error("Execute error", e);
        }
    }


}
