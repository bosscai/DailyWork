package com.example.dailywork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DailyWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyWorkApplication.class, args);
    }

}
