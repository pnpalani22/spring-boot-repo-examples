package com.bofa.training.itemorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ItemOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemOrderServiceApplication.class, args);
    }

}