package com.bofa.training.numberservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//the configuration will be passed through numberservice.properties file
@ConfigurationProperties("numberservice")
public class NumberConfiguration {
    private int minimum;
    private int maximum;
    public NumberConfiguration(int minimum, int maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }
    public NumberConfiguration() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int getMinimum() {
        return minimum;
    }
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
    public int getMaximum() {
        return maximum;
    }
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
    
    
}