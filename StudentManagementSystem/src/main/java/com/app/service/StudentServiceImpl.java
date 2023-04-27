package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Course;
import com.app.entity.Student;
import com.app.exception.StudentException;
import com.app.repo.CourseRepo;
import com.app.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	CourseRepo courseRepo;
	
	@Override
	public Student getStudentById(Integer studentId) throws StudentException {
		
		return studentRepo.findById(studentId).orElseThrow(() -> new StudentException("Student not found with id: "+studentId));
	}

	@Override
	public Student addStudent(Student student) throws Exception {
		student.setMobile_no(student.getMobile_no());
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) throws Exception {
		student.setMobile_no(student.getMobile_no());
		return studentRepo.save(student);
	}

	@Override
	public Student removeStudent(Integer studentId) throws StudentException {
		
		Student student=getStudentById(studentId);
		studentRepo.delete(student);
		return student;
	}

	@Override
	public Student mapCoursesToStudent(List<Integer> courseIds, Integer studentId) throws StudentException {
		
		Student student=getStudentById(studentId);
		List<Course>courses=courseRepo.findAllById(courseIds);
		student.getCourses().addAll(courses);
		return studentRepo.save(student);
	}

	@Override
	public Student removeCourseFromStudent(Integer studentId, List<Integer> courseIds) throws StudentException {
		
		Student student=getStudentById(studentId);
		List<Course>courses=student.getCourses();
		for(int i=0;i<courses.size();i++) {
			for(int j=0;j<courseIds.size();j++) {
				if(courseIds.get(j)==courses.get(i).getId()) {
					courses.remove(i);
				}
			}
		}
		return studentRepo.save(student);
	}

}
