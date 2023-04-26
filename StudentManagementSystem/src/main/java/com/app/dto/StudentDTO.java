package com.app.dto;

import java.util.List;

import com.app.entity.Address;

import jakarta.persistence.OneToMany;

public class StudentDTO {

    private Integer id;
	private String name;
	private String email;
	private String mobile_no;
	private String parents_name;
	
	@OneToMany(mappedBy ="student")
	private List<Address> addresses;

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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDTO(String email, String mobile_no, String parents_name, List<Address> addresses) {
		super();
		this.email = email;
		this.mobile_no = mobile_no;
		this.parents_name = parents_name;
		this.addresses = addresses;
	}
	
	
	
}
