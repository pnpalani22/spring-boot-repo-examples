package com.bofa.training.testclient;


import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GetXMLClient {

	public static void main(String[] args) {
		 String url="http://localhost:8080/emp/2";
		    RestTemplate template=new RestTemplate();
		    HttpHeaders headers=new HttpHeaders();
		    headers.put("Accept", Arrays.asList(MediaType.APPLICATION_XML_VALUE));
		    ResponseEntity<String> entity= template.exchange(url, HttpMethod.GET, new HttpEntity<>(headers),
		            String.class);
		    System.out.println(entity.getBody());
    
	}
}
