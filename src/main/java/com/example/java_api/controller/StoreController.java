package com.example.java_api.controller;

import com.example.java_api.model.User;
import com.example.java_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StoreController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/get-all-users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/get-user-by-id/{id}")
    public User getSingleUser(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }
}
