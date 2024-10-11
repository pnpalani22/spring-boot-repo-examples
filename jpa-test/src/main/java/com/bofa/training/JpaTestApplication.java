package com.bofa.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bofa.training.domain.Employee;
import com.bofa.training.repository.EmployeeRepository;

@SpringBootApplication
public class JpaTestApplication {

	@Autowired
	private EmployeeRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaTestApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        repository.save(new Employee(1001, "Arvind", "Developer"));
        repository.save(new Employee(1002, "Surya", "Accountant"));
        List<Employee> employees= repository.findAll();
        employees.forEach(e->System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getDesignation()));
    }

}
