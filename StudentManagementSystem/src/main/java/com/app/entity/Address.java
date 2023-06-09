package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String area;
	private String state;
	private String district;
	private String pinecode;
	private String addressType;
	
	@ManyToOne
	private Student student;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getPinecode() {
		return pinecode;
	}
	
	public void setPinecode(String pinecode) throws Exception {
       if(pinecode.matches("[0-9]{6}")) {
			
			this.pinecode = pinecode;
		}
		else
			throw new Exception("Pincode should have 6 numbers!!!");

	}
	
	public String getAddressType() {
		return addressType;
	}
	
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Integer id, String area, String state, String district, String pinecode, String addressType) {
		super();
		this.id = id;
		this.area = area;
		this.state = state;
		this.district = district;
		this.pinecode = pinecode;
		this.addressType = addressType;
	}
	
	
	
}
