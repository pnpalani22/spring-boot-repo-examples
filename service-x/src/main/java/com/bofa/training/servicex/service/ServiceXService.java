package com.bofa.training.servicex.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceXService {
    @Autowired
    private RestTemplate template;
//  private Logger logger=LoggerFactory.getLogger(ServiceXService.class);
    @CircuitBreaker(name = "servicey",fallbackMethod = "handleServiceYFailure")
    
    public String getData() {
        log.info("invoking service y");
        String respFromServiceY=template.getForObject("http://localhost:8080/servicey/test",
                String.class);
        return "Data: "+respFromServiceY;
    }
    
    public String handleServiceYFailure(Exception e) {
        return "<font color='red'><h3>Requested Service is not currently available. Try after some time</h3></font>";
    }
}