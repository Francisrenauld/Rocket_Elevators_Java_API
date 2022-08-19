package com.example.java_api.controller;

import com.example.java_api.model.Columns;
import com.example.java_api.repository.ColumnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ColumnController {

    @Autowired
    ColumnRepo columnRepo;

    @GetMapping("/get-all-columns")
    public List<Columns> getAllColumn(){
        return columnRepo.findAll();
    }

    @GetMapping("/get-column-by-id/{id}")
    public Columns getSingleColumn(@PathVariable("id") Integer id){
        return columnRepo.findById(id).get();
    }

    @GetMapping("/get-column-by-battery/{batteryId}")
    public List<Columns> getBatteryByBuilding(@PathVariable("batteryId") Integer batteryId){
        return columnRepo.findByBatteryId(batteryId);
    }
}
