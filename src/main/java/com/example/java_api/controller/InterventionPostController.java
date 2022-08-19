package com.example.java_api.controller;

import com.example.java_api.model.InterventionPost;
import com.example.java_api.repository.InterventionPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InterventionPostController {

    @Autowired
    InterventionPostRepo interventionPostRepo;

    @PostMapping("/create-intervention")
    public InterventionPost create(@RequestBody InterventionPost newInterventionPost){
        System.out.println(newInterventionPost);
        System.out.println(newInterventionPost.getCustomer());
        return interventionPostRepo.save(newInterventionPost);
    }
}
