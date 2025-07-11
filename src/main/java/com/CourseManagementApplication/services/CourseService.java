package com.CourseManagementApplication.services;

import java.util.List;

import com.CourseManagementApplication.entity.Course;

public interface CourseService {
	
	Course create(Course course);
    List<Course> getAll();
    Course getById(Long id);
    Course update(Long id, Course course);
    void delete(Long id);

}
