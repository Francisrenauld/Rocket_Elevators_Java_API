package com.example.java_api.controller;

import com.example.java_api.model.Elevator;
import com.example.java_api.repository.ElevatorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ElevatorController {

    @Autowired
    ElevatorRepo ElevatorRepo;

    @GetMapping("/get-all-elevators")
    public List<Elevator> getAllElevator(){
        return ElevatorRepo.findAll();
    }

    @GetMapping("/get-elevator-by-id/{id}")
    public Elevator getSingleElevator(@PathVariable("id") Integer id){
        return ElevatorRepo.findById(id).get();
    }
}
