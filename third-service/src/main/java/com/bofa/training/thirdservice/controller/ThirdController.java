package com.bofa.training.thirdservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/third")
public class ThirdController {
    @GetMapping("/data")
    public String getData()
    {
        return "Data from third service";
    }

}
