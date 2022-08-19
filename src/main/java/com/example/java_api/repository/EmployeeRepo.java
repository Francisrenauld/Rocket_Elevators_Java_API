package com.example.java_api.repository;

import com.example.java_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
