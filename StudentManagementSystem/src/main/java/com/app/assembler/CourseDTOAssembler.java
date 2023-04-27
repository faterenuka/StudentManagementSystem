package com.app.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.dto.CourseDTO;
import com.app.entity.Course;

@Component
public class CourseDTOAssembler {

	public List<CourseDTO>toDtos(List<Course> courses){
		
		List<CourseDTO>courseDtos=new ArrayList<>();
		courses.forEach(course -> courseDtos.add(toDto(course)));
		return courseDtos;
		
	}
	public List<Course> fromDtos(List<CourseDTO> courseDtos){
		
		List<Course> courses=new ArrayList<>();
		courseDtos.forEach(courseDto ->  courses.add(fromDto(courseDto)));
		return courses;
	}
	public CourseDTO toDto(Course course) {
		
		CourseDTO courseDto=new CourseDTO();
		courseDto.setId(course.getId());
		courseDto.setDuration(course.getDuration());
		courseDto.setCourseType(course.getCourseType());
		courseDto.setCourse_name(course.getCourseName());
		return courseDto;
		
	}
	
	public Course fromDto(CourseDTO courseDto) {
		
		Course course=new Course();
		course.setId(courseDto.getId());
		course.setDuration(courseDto.getDuration());
		course.setCourseType(courseDto.getCourseType());
		course.setCourseName(courseDto.getCourseName());
		return course;
	}
	
}
