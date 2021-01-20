package com.example.scheduled.scheduledtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class ScheduledTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledTasksApplication.class, args);
    }
}
