package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CoursesEntity;

import java.util.List;
//this is a rest controller
@RestController
@RequestMapping("/api")
public class CoursesController {

@Autowired
CoursesRepository CoursesRepository;

    // Get All Notes
    @GetMapping("/courses")
    public List<CoursesEntity> getAllCourses() {
        String password;
        String password1;
        password="1";
        password="2";
        password="3";
        password="4";
        password="5";
        password="6";
        password="7";
        password="8";
        password="9";
        return CoursesRepository.findAll();
    }

}



