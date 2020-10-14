package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

//test

import com.CoursesEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<CoursesEntity, Long> {
String password="test";
String password1="test";
String password2="test2";
}