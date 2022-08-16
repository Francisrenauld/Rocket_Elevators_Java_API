package com.example.java_api.controller;

import com.example.java_api.model.Elevator;
import com.example.java_api.repository.MySqlRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ElevatorController {

    @Autowired
    MySqlRepository2 MySqlRepository2;

    @GetMapping("/get-all-elevators")
    public List<Elevator> getAllElevator(){
        return MySqlRepository2.findAll();
    }

    @GetMapping("/get-elevator-by-id/{id}")
    public Elevator getSingleElevator(@PathVariable("id") Integer id){
        return MySqlRepository2.findById(id).get();
    }
}
