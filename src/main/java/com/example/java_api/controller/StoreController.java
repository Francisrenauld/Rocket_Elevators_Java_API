package com.example.java_api.controller;

import com.example.java_api.model.User;
import com.example.java_api.repository.MySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StoreController {

    @Autowired
    MySqlRepository mySqlRepository;

    @GetMapping("/get-all-users")
    public List<User> getAllUsers(){

        return mySqlRepository.findAll();

    }

    @GetMapping("/get-user-by-id/{id}")
    public User getSingleUser(@PathVariable("id") Integer id){

        return mySqlRepository.findById(id).get();

    }




}
