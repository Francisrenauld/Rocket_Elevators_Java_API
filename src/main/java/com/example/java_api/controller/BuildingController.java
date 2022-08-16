package com.example.java_api.controller;

import com.example.java_api.model.Building;
import com.example.java_api.repository.BuildingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BuildingController {

    @Autowired
    BuildingRepo BuildingRepo;

    @GetMapping("/get-all-buildings")
    public List<Building> getAllBuilding(){
        return BuildingRepo.findAll();
    }

    @GetMapping("/get-building-by-id/{id}")
    public Building getSingleBuilding(@PathVariable("id") Integer id){
        return BuildingRepo.findById(id).get();
    }
}
