package com.example.java_api.controller;

import com.example.java_api.model.Building;
import com.example.java_api.model.Customer;
import com.example.java_api.model.User;
import com.example.java_api.repository.BuildingRepo;
import com.example.java_api.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BuildingController {

    @Autowired
    BuildingRepo buildingRepo;

    @Autowired
    CustomerRepo customerRepo;

    @GetMapping("/get-all-buildings")
    public List<Building> getAllBuilding(){
        return buildingRepo.findAll();
    }

    @GetMapping("/get-building-by-id/{id}")
    public Building getSingleBuilding(@PathVariable("id") Integer id){
        return buildingRepo.findById(id).get();
    }

    @GetMapping("/get-building-by-current-user")
    public Building getCurrentBuilding(){
        User auth = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer user_id = auth.getId();
        Customer customer = (Customer) customerRepo.findByUser_id(user_id);
        Integer Customer_id = customer.getId();
        return (Building) buildingRepo.findByCustomer_id(Customer_id);
    }
}
