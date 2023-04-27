package com.app.dto;

import com.app.entity.Student;

public class AddressDTO {

	private Integer id;
	private String pinecode;
	private String addressType;
	private String area;
	private String state;
	private String district;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPinecode() {
		return pinecode;
	}
	public void setPinecode(String pinecode) {
		this.pinecode = pinecode;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public AddressDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressDTO(Integer id, String pinecode, String addressType, String state) {
		super();
		this.id = id;
		this.pinecode = pinecode;
		this.addressType = addressType;
		this.state = state;
	}
	
	
	
}
