package com.example.java_api.controller;

import com.example.java_api.model.Customer;
import com.example.java_api.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo CustomerRepo;

    @GetMapping("/get-all-customer")
    public List<Customer> getAllCustomer(){
        return CustomerRepo.findAll();
    }

    @GetMapping("/get-customer-by-id/{id}")
    public Customer getSingleCustomer(@PathVariable("id") Integer id){
        return CustomerRepo.findById(id).get();
    }

    @PostMapping("/add-customer")
    public Customer create(@RequestBody Customer newCustomer){
        return CustomerRepo.save(newCustomer);
    }

}
