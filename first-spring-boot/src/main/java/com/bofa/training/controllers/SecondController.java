package com.bofa.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/second")
public class SecondController {
	@RequestMapping(value = "/msg")
    public @ResponseBody String simpleResponse() {
        return "<html><body><h2>This is second controller</h2></body></html>";
    }
}