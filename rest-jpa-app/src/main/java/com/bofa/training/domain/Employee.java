package com.bofa.training.domain;

import jakarta.xml.bind.annotation.XmlRootElement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_tbl")
@XmlRootElement
public class Employee {

    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "emp_name")
    private String name;
    private String designation;
    public Employee(int id, String name, String designation) {
        super();
        this.id = id;
        this.name = name;
        this.designation = designation;
    }
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
    
    
}
