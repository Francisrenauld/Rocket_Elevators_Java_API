package com.example.java_api.controller;

import com.example.java_api.model.Customer;
import com.example.java_api.model.User;
import com.example.java_api.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @GetMapping("/get-all-customer")
    public List<Customer> getAllCustomer(){
        return customerRepo.findAll();
    }

    @GetMapping("/get-customer-by-id/{id}")
    public Customer getSingleCustomer(@PathVariable("id") Integer id){
        return customerRepo.findById(id).get();
    }

    @PostMapping("/create-customer")
    public Customer create(@RequestBody Customer newCustomer){
        return customerRepo.save(newCustomer);
    }

    @GetMapping("/get-customer-by-current-user")
    public Customer getACustomer(){
        User auth = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer user_id = auth.getId();
        return (Customer) customerRepo.findByUser_id(user_id);
    }
}
