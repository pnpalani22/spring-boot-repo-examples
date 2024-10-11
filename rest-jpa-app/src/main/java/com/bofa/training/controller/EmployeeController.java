package com.bofa.training.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.training.domain.Employee;
import com.bofa.training.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping(path="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Employee> getEmployee (@PathVariable("id") int empId) {
		Employee employee=service.findEmployee(empId);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	 @PostMapping(produces = MediaType.TEXT_PLAIN_VALUE,consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	    public ResponseEntity<String> addEmployee(@RequestBody Employee e){
	        int id=service.addEmployee(e);
	        return new ResponseEntity<>("Employee with id "+id+" added successfully", HttpStatus.CREATED);
	    }
	 
	 @PutMapping(path="/{id}",produces = MediaType.TEXT_PLAIN_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<String> updateEmployee(@PathVariable("id") int empId, @RequestBody Employee e){
	        int id=service.updateEmployee(empId, e);
	        return new ResponseEntity<>("Employee with id "+id+" updated successfully", HttpStatus.CREATED);
	    }
	 
	 @DeleteMapping(path="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> DeleteEmployee (@PathVariable("id") int empId) {
			int id=service.removeEmployee(empId);
			 return new ResponseEntity<>("Employee with id "+id+" deleted successfully", HttpStatus.OK);
		}
	 
	 @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<List<Employee>> getAllEmployees(){
		 return new ResponseEntity<List<Employee>>(service.getAllEmployees(),HttpStatus.OK);
	 }
}
