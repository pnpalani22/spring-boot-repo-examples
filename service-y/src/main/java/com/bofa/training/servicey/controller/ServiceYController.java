package com.bofa.training.servicey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/servicey")
@RestController
public class ServiceYController {

    @GetMapping("/test")
    public String getData() {
        return "Data from ServiceY";
    }
}