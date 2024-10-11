package com.bofa.training.testclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.bofa.training.domain.Employee;

public class PostClient {
	
	public static void main(String[] args) {
	    String url="http://localhost:8080/emp";
	    RestTemplate template=new RestTemplate();
	    HttpHeaders headers=new HttpHeaders();
	    headers.put("Content-Type", Arrays.asList(MediaType.APPLICATION_JSON_VALUE));
	    
	    Employee e=new Employee();
	    e.setName("Suresh");
	    e.setDesignation("Architect");
	    String respMsg= template.postForObject(url, e,
	            String.class,new HttpEntity<>(headers));
	    
	    
	    System.out.println(respMsg);
	}
}
