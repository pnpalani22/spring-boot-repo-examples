package com.bofa.training.firstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/data")
    public String getData()
    {
        return "Data from first service";
    }

}
