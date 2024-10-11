package com.bofa.training.numberservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bofa.training.numberservice.config.NumberConfiguration;
import com.bofa.training.numberservice.domain.Number;
@Service
public class NumberService {
    
    @Autowired
    private NumberConfiguration configuration;
    
    public Number getNumber() {
        return new Number(configuration.getMinimum(), configuration.getMaximum());
    }

}