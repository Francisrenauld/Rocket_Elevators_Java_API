package com.example.java_api.repository;


import com.example.java_api.model.Customer;
import com.example.java_api.model.InterventionPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterventionPostRepo extends JpaRepository<InterventionPost,Integer> {

}
