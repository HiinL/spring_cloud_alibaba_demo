package com.xun.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Uny
 */
@SpringBootApplication
public class SentinelRateLimitingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelRateLimitingApplication.class, args);
    }

}
