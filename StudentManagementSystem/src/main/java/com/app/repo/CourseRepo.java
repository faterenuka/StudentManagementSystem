package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

	List<Course> findByCourseName(String name);

}
