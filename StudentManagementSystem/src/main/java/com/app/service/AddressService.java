package com.app.service;

import com.app.entity.Address;
import com.app.exception.AddressException;

public interface AddressService {

	Address getAddressById(Integer addressId) throws AddressException;
	
	Address addAddress(Address address) throws Exception;
	
	Address updateAddress(Address address);
	
	Address deleteAddress(Integer addressId) throws AddressException;
	
}
