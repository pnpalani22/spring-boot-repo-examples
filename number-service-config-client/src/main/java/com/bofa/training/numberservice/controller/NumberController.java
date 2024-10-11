package com.bofa.training.numberservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.training.numberservice.domain.Number;
import com.bofa.training.numberservice.service.NumberService;

@RestController
@RequestMapping("/number")
public class NumberController {
    @Autowired
    private NumberService service;
    @GetMapping(path="/test",produces = MediaType.APPLICATION_JSON_VALUE)
    public Number getNumber() {
        return service.getNumber();
    }
}