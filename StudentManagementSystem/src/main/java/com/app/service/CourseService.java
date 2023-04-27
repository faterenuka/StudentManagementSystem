package com.app.service;

import java.util.List;

import com.app.entity.Course;
import com.app.exception.CourseException;

public interface CourseService {

	Course getCourseById(Integer courseId) throws CourseException; 
	
	Course addCourse(Course course);
	
	Course updateCourse(Course course);
	
	Course removeCourse(Integer courseId) throws CourseException;
	
	List<Course> getCourse(String courseName);
}
