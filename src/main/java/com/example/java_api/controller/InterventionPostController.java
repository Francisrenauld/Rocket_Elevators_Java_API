package com.example.java_api.controller;

import com.example.java_api.model.*;
import com.example.java_api.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class InterventionPostController {

    @Autowired
    InterventionPostRepo interventionPostRepo;
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    BuildingRepo buildingRepo;
    @Autowired
    BatteryRepo batteryRepo;
    @Autowired
    ColumnRepo columnRepo;
    @Autowired
    ElevatorRepo elevatorRepo;
    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping("/create-intervention")
    public List<Object> create(@RequestBody InterventionPost newInterventionPost){
        List<Object> objects = new ArrayList<Object>();
        Customer customer = newInterventionPost.getCustomer();
        Building Building = newInterventionPost.getBuilding();
        Battery battery = newInterventionPost.getBattery();
        Columns column = newInterventionPost.getColumn();
        Elevator elevator = newInterventionPost.getElevator();
        Employee employee = newInterventionPost.getEmployee();
        Integer customer_id = customer.getId();
        Integer building_id = Building.getId();
        Integer battery_id = battery.getId();
        Integer column_id = column.getId();
        Integer elevator_id = elevator.getId();
        Integer employee_id = employee.getId();
        interventionPostRepo.save(newInterventionPost);
        objects.add("intervention Id :");
        objects.add(newInterventionPost.getId());
        objects.add("author Id :");
        objects.add(newInterventionPost.getAuthor());
        objects.add("customer :");
        objects.add(customerRepo.findById(customer_id));
        objects.add("building :");
        objects.add(buildingRepo.findById(building_id));
        objects.add("battery :");
        objects.add(batteryRepo.findById(battery_id));
        objects.add("column :");
        objects.add(columnRepo.findById(column_id));
        objects.add("elevator :");
        objects.add(elevatorRepo.findById(elevator_id));
        objects.add("employee :");
        objects.add(employeeRepo.findById(employee_id));
        return objects;
    }
}
