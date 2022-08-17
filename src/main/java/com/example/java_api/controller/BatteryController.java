package com.example.java_api.controller;

import com.example.java_api.model.Battery;
import com.example.java_api.repository.BatteryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class BatteryController {

    @Autowired
    BatteryRepo BatteryRepo;

    @GetMapping("/get-all-batteries")
    public List<Battery> getAllBattery(){
        return BatteryRepo.findAll();
    }

    @GetMapping("/get-battery-by-id/{id}")
    public Battery getSingleBattery(@PathVariable("id") Integer id){
        return BatteryRepo.findById(id).get();
    }
    @GetMapping("/get-battery-by-building/{buildingId}")
    public List<Battery> getBatteryByBuilding(@PathVariable("buildingId") Integer buildingId){
        return BatteryRepo.findByBuildingId(buildingId);
    }


}
