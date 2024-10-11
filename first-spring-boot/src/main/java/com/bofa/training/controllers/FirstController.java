package com.bofa.training.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class FirstController {
 
	 @RequestMapping("/msg/{name}")
	    public @ResponseBody String simpleResponse(@PathVariable("name") String userName) {
	        return "<html><body><h2>Welcome to Spring Boot "+userName+" </h2></body></html>";
	    }
	    
	    
	    @RequestMapping("/msg/{firstName}/{lastName}")
	    public @ResponseBody String simpleResponse(@PathVariable("firstName") String firstName,
	            @PathVariable("lastName") String lastName) {
	        return "<html><body><h2>Welcome to Spring Boot "+firstName+" "+lastName+" </h2></body></html>";
	    }
}
