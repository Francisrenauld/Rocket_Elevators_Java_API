package com.example.java_api.controller;

import com.example.java_api.model.Intervention;
import com.example.java_api.repository.InterventionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class InterventionController {

    @Autowired
    InterventionRepo InterventionRepo;

    @GetMapping("/get-all-interventions")
    public List<Intervention> getAllInterventions(){
        return InterventionRepo.findAll();
    }

    @GetMapping("/get-interventions-by-id/{id}")
    public Intervention getSingleIntervention(@PathVariable("id") Integer id){
        return InterventionRepo.findById(id).get();
    }
}
