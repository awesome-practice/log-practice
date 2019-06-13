package com.practice.springboot.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogPracticeApplication implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogPracticeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogPracticeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("hello, every{}", "one");
    }
}
