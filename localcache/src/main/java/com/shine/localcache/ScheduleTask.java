package com.shine.localcache;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@EnableScheduling
public class ScheduleTask {

    @Resource
    CacheService cacheService;

    @Scheduled(fixedDelay = 3000)
    public void refresh() {
        cacheService.updateString();
    }

    @Scheduled(fixedDelay = 3000)
    public void get() {
        System.out.println(cacheService.getString());
    }
}
