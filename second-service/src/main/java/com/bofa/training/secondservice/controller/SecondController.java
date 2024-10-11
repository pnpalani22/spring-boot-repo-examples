package com.bofa.training.secondservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
    @GetMapping("/data")
    public String getData()
    {
        return "Data from second service";
    }

}
