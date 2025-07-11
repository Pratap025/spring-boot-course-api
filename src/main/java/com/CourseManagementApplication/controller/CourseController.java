package com.CourseManagementApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CourseManagementApplication.entity.Course;
import com.CourseManagementApplication.servicesImpl.CourseServiceImpl;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

	@Autowired
	private CourseServiceImpl courImpl;
	
	
	  @PostMapping
	    public ResponseEntity<Course> create(@RequestBody Course course) {
	        return new ResponseEntity<>(courImpl.create(course), HttpStatus.CREATED);
	    }
	
	
}
