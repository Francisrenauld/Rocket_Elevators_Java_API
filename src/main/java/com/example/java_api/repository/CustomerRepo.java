package com.example.java_api.repository;

import com.example.java_api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{
}
