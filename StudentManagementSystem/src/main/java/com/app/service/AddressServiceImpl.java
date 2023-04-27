package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Address;
import com.app.exception.AddressException;
import com.app.repo.AddressRepo;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepo addressRepo;
	
	@Override
	public Address getAddressById(Integer addressId) throws AddressException {
		
		return addressRepo.findById(addressId).orElseThrow(() -> new AddressException("Address not found with addressId: "+addressId));
	}

	@Override
	public Address addAddress(Address address) throws Exception {
		address.setPinecode(address.getPinecode());
		return addressRepo.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		
		return addressRepo.save(address);
	}

	@Override
	public Address deleteAddress(Integer addressId) throws AddressException {
		
		Address address=getAddressById(addressId);
		addressRepo.delete(address);
		return address;
	}

}
