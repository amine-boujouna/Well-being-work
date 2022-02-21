package com.example.examensae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class ExamensaeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamensaeApplication.class, args);
    }

}
