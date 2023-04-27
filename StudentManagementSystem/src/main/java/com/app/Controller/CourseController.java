package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.assembler.CourseDTOAssembler;
import com.app.dto.CourseDTO;
import com.app.entity.Course;
import com.app.exception.CourseException;
import com.app.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	CourseDTOAssembler courseAssembler;

	@GetMapping("/course")
    public ResponseEntity<CourseDTO> getCourseById(@RequestParam Integer courseId) throws CourseException{
    	
    	Course course=courseService.getCourseById(courseId);
    	return new ResponseEntity<CourseDTO>(courseAssembler.toDto(course), HttpStatus.OK);
    }
	
	@PostMapping("/course")
	public ResponseEntity<CourseDTO> addCourse(@RequestBody CourseDTO courseDto) {
		
		Course course=courseAssembler.fromDto(courseDto);
		course=courseService.addCourse(course);
		return new ResponseEntity<CourseDTO>(courseAssembler.toDto(course), HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping("/course")
	public ResponseEntity<CourseDTO> updateCourse(@RequestBody CourseDTO courseDto) {
		
		Course course=courseAssembler.fromDto(courseDto);
		course=courseService.updateCourse(course);
		return new ResponseEntity<CourseDTO>(courseAssembler.toDto(course), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/course")
	public ResponseEntity<CourseDTO> removeCourse(@RequestParam Integer courseId) throws CourseException{
		
		Course course=courseService.removeCourse(courseId);
		return new ResponseEntity<CourseDTO>(courseAssembler.toDto(course), HttpStatus.OK);
	}
	
	@GetMapping("/course/{all}")
	public ResponseEntity<List<CourseDTO>> getCourse(@RequestParam String courseName){
		
		List<Course> courses=courseService.getCourse(courseName);
		return new ResponseEntity<List<CourseDTO>>(courseAssembler.toDtos(courses), HttpStatus.OK);
	}

}
