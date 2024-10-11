package com.bofa.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bofa.training.domain.Employee;
import com.bofa.training.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
public int addEmployee(Employee e) {
	Employee e1=repository.saveAndFlush(e);
	return e1.getId();
}

public Employee findEmployee(int id) {
	return repository.findById(id).get();
}

public List<Employee> getAllEmployees(){
	return repository.findAll();
}

public int updateEmployee(int id, Employee e) {
	Employee e1=repository.findById(id).get();
	e1.setName(e.getName());
	e1.setDesignation(e.getDesignation());
	repository.save(e1);
	return id;
}

public int removeEmployee(int id) {
    Employee e1=repository.findById(id).get();
    repository.delete(e1);
    return id;
}

}
