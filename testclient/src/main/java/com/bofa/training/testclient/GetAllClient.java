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

public class GetAllClient {

	public static void main(String[] args) {
	    String url="http://localhost:8080/emp";
	    RestTemplate template=new RestTemplate();
	    HttpHeaders headers=new HttpHeaders();
	    headers.put("Accept", Arrays.asList(MediaType.APPLICATION_JSON_VALUE));
	    ResponseEntity<List<Employee>> entity=template.exchange(url,
	            HttpMethod.GET, new HttpEntity<>(headers),
	            new ParameterizedTypeReference<List<Employee>>() {});
	    entity.getBody().forEach(e->System.out.println(e.getName()+"\t"+e.getDesignation()));
	}
}
