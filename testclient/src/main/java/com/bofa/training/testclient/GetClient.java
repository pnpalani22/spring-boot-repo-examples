package com.bofa.training.testclient;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.bofa.training.domain.Employee;

public class GetClient {

	public static void main(String[] args) {
		 String url="http://localhost:8080/emp";
		    RestTemplate template=new RestTemplate();
		    HttpHeaders http=new HttpHeaders();
		  //  http.put("Accept", Arrays.asList(MediaType.APPLICATION_XML_VALUE));
		    ResponseEntity<ArrayList> entity= template.getForEntity(url,ArrayList.class);
		    System.out.println("response status: "+entity.getStatusCodeValue());
		    System.out.println("Response body ");
		    List<Employee> e=entity.getBody();
		    for(Employee et:e) {
		    	System.out.println(et.getName()+"\t"+et.getDesignation());
		    }
		    
		    ResponseEntity<String> entity1= template.getForEntity(url,String.class);
		    System.out.println(entity1.getBody());
		    
		    
	}
}
