package com.CourseManagementApplication.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CourseManagementApplication.entity.Course;
import com.CourseManagementApplication.repo.CourseRepository;
import com.CourseManagementApplication.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course create(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Course getById(Long id) {
		// TODO Auto-generated method stub
		return courseRepository.findById(id).orElseThrow(()->new RuntimeException("Course not found"));
	}

	@Override
	public Course update(Long id, Course course) {
		// TODO Auto-generated method stub
		Course existId=getById(id);
		if(existId != null) {
		existId.setTitle(course.getTitle());
		existId.setDuration(course.getDuration());
		existId.setEmail(course.getEmail());
		}
		
		return courseRepository.save(existId);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
		
	}

}
