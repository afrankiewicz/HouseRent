package com.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HouseRentApplication {

    public static String AUTH_USER_EMAIL = "test@gmail.com";

    public static void main(String[] args) {
        SpringApplication.run(HouseRentApplication.class, args);
    }
}
