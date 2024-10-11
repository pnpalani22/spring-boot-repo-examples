package com.bofa.training.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bofa.training.domain.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	
	
}
