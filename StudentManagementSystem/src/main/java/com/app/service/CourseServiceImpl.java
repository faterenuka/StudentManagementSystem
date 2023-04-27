package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Course;
import com.app.exception.CourseException;
import com.app.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepo courseRepo;
	
	@Override
	public Course getCourseById(Integer courseId) throws CourseException {
		
		return courseRepo.findById(courseId).orElseThrow(()-> new CourseException("Course is not found with id"+ courseId));
	}

	@Override
	public Course addCourse(Course course) {
		
		return courseRepo.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		
		return courseRepo.save(course);
	}

	@Override
	public Course removeCourse(Integer courseId) throws CourseException {
		
		Course course=getCourseById(courseId);
		courseRepo.delete(course);
		return course;
	}

	@Override
	public List<Course> getCourse(String courseName) {
		
		return courseRepo.findByCourseName(courseName);
	}

}
