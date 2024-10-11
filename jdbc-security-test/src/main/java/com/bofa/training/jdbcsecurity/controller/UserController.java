package com.bofa.training.jdbcsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

	 @GetMapping("/welcome")
	    public String welcome()
	    {
	        return "Welcome";
	    }
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/userdata")
    public String userData()
    {
        return "Welcome to user profile";
    }
    
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/admindata")
    public String adminData()
    {
        return "Welcome to admin profile";
    }
}
