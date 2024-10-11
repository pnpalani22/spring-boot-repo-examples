package com.bofa.training.testsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
           
	//Here UserDetailsService,userdetails, user spring provided default object for authentication
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        UserDetails admin=User.withUsername("administrator").password("$2a$10$mihFOLZaqzj6jf6e7ilKvuBJMEpjMs5/O2Y6ovPMbX/ID6cYqlI3.")
                .roles("ADMIN","USER").build();
        
        UserDetails user1=User.withUsername("user1").password("$2a$10$6dymEB9uwuGjOZcXgGDA1eTIy0YPHSj9RyGGE0hKpHIB2XJ0vRQEW")
                .roles("USER").build();
        return new InMemoryUserDetailsManager(admin,user1);
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    //TODO: httpbasic shows as alert login in browser, by default its form
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http.authorizeHttpRequests(auth->
        auth.requestMatchers("/auth/welcome").permitAll()
                .requestMatchers("/auth/userdata/**").authenticated()
                .requestMatchers("/auth/admindata/**").authenticated()
        ).httpBasic(Customizer.withDefaults()).build();     
    }

}