package com.example.java_api.controller;

import com.example.java_api.model.Column;
import com.example.java_api.repository.ColumnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ColumnController {

    @Autowired
    ColumnRepo ColumnRepo;

    @GetMapping("/get-all-columns")
    public List<Column> getAllColumn(){
        return ColumnRepo.findAll();
    }

    @GetMapping("/get-column-by-id/{id}")
    public Column getSingleColumn(@PathVariable("id") Integer id){
        return ColumnRepo.findById(id).get();
    }
}
