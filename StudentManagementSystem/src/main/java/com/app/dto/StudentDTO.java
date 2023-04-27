package com.app.dto;

import java.util.List;

public class StudentDTO {

    private Integer id;
	private String name;
	private String email;
	private String mobile_no;
	private String parents_name;
	
	private List<AddressDTO> addressDtos;

	private List<CourseDTO> courseDtos;
	
	
	public List<AddressDTO> getAddressDtos() {
		return addressDtos;
	}

	public void setAddressDtos(List<AddressDTO> addressDtos) {
		this.addressDtos = addressDtos;
	}

	public List<CourseDTO> getCourseDtos() {
		return courseDtos;
	}

	public void setCourseDtos(List<CourseDTO> courseDtos) {
		this.courseDtos = courseDtos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getParents_name() {
		return parents_name;
	}

	public void setParents_name(String parents_name) {
		this.parents_name = parents_name;
	}
	
	
}
