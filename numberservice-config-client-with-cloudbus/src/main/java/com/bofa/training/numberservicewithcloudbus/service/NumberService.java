package com.bofa.training.numberservicewithcloudbus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bofa.training.numberservicewithcloudbus.config.NumberConfiguration;
import com.bofa.training.numberservicewithcloudbus.domain.Number;
@Service
public class NumberService {
    
    @Autowired
    private NumberConfiguration configuration;
    
    public Number getNumber() {
        return new Number(configuration.getMinimum(), configuration.getMaximum());
    }

}