package com.bofa.training.servicex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.training.servicex.service.ServiceXService;

@RequestMapping("/servicex")
@RestController
public class ServiceXController {
@Autowired
private ServiceXService xservice;
    
    @GetMapping(path="/test",produces = MediaType.TEXT_HTML_VALUE)
    public String getMessage() {
        String msg="<html><body><h3>Service X gets data from Service Y</br>";
        msg+="</br>";
        msg+=xservice.getData()+"</h3></body></html>";
        return msg;
    }
}
