package com.example.java_api.controller;

import com.example.java_api.model.Intervention;
import com.example.java_api.repository.InterventionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/remove-intervention/{id}")
    public boolean deleteRow(@PathVariable("id") Integer id){
        if(!InterventionRepo.findById(id).equals(Optional.empty())){
            InterventionRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @PutMapping("/update-intervention/{id}")
    public Intervention updateIntervention(@PathVariable("id") Integer id,
                                           @RequestBody Map<String, String> body){
        Intervention intervention = InterventionRepo.findById(id).get();
        intervention.setBuilding_id(Integer.parseInt(body.get("building_id")));
        intervention.setBattery_id(Integer.parseInt(body.get("battery_id")));
        intervention.setColumn_id(Integer.parseInt(body.get("column_id")));
        intervention.setElevator_id(Integer.parseInt(body.get("elevator_id")));
        intervention.setReport((body.get("report")));
        InterventionRepo.save(intervention);
        return intervention;
    }
}
