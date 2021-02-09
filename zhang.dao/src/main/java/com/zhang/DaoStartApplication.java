package com.zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.zhang.dao.mapper"})
public class DaoStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(DaoStartApplication.class, args);
    }
}
