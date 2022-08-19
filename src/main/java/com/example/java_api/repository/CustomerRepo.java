package com.example.java_api.repository;

import com.example.java_api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{

    Object findByUser_id(Long user_id);
}

