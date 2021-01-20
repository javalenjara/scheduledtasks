package com.example.scheduled.scheduledtasks.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CurrentTime {

    @Scheduled(fixedRate = 3000L)
    void currentTimeJob() {
        System.out.println("Time now: " + LocalDateTime.now());
    }
}
