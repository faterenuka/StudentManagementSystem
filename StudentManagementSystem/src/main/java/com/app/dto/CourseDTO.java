package com.app.dto;

public class CourseDTO {

    private Integer id;
	private String course_name;
	private String courseType;
	private String duration;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
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
	public CourseDTO(Integer id, String course_name, String courseType, String duration) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.courseType = courseType;
		this.duration = duration;
	}
	
	
	
}
