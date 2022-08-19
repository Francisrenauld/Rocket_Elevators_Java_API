package com.example.java_api.controller;

import com.example.java_api.model.Customer;
import com.example.java_api.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
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

}
