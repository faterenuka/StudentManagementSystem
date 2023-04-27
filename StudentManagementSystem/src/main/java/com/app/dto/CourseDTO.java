package com.app.dto;

public class CourseDTO {

    private Integer id;
	private String courseName;
	private String courseType;
	private String duration;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourse_name(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public CourseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseDTO(Integer id, String courseName, String courseType, String duration) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseType = courseType;
		this.duration = duration;
	}
	
	
	
}
