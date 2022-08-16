package com.example.java_api.repository;

import com.example.java_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlRepository extends JpaRepository<User,Integer>{
}
