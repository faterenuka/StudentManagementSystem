package com.app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer student_code;
	
	private String name;
	private String gender;
	private LocalDate date_of_birth;
	private String email;
	private String mobile_no;
	private String parents_name;
	
	@OneToMany
	private List<Address> addresses;
	
	@ManyToMany
	private List<Course> courses;
	
	public Integer getStudent_code() {
		return student_code;
	}
	
	public void setStudent_code(Integer student_code) {
		this.student_code = student_code;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_no(){
		return mobile_no;
	
	}

	public void setMobile_no(String mobile_no) throws Exception {
		if(mobile_no.matches("[6-9]{1}[0-9]{9}")) {
			this.mobile_no = mobile_no;
		}else {
			throw new Exception("Invalid Mobile number");
		}
	}

	public String getParents_name() {
		return parents_name;
	}

	public void setParents_name(String parents_name) {
		this.parents_name = parents_name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}
	
	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer student_code, String name, String gender, LocalDate date_of_birth, Address address) {
		super();
		this.student_code = student_code;
		this.name = name;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
	}
	
	
}
