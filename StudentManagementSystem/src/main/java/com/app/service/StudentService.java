package com.app.service;

import java.util.List;

import com.app.entity.Student;
import com.app.exception.StudentException;

public interface StudentService {

	Student getStudentById(Integer studentId) throws StudentException;
	
	Student addStudent(Student student) throws Exception;
	
	Student updateStudent(Student student) throws Exception;
	
	Student removeStudent(Integer studentId) throws StudentException;
	
	Student mapCoursesToStudent(List<Integer> courseIds, Integer studentId) throws StudentException;
	
	Student removeCourseFromStudent(Integer studentId, List<Integer> courseIds) throws StudentException;
	
}
