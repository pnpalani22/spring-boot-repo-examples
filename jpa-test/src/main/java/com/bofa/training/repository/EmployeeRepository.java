package com.bofa.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bofa.training.domain.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}