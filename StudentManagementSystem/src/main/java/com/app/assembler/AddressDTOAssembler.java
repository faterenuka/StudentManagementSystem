package com.app.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.dto.AddressDTO;
import com.app.entity.Address;

@Component
public class AddressDTOAssembler {

	public List<AddressDTO> toDtos(List<Address> addresses){
		
		List<AddressDTO> addressDtos=new ArrayList<>();
		addresses.forEach(address ->addressDtos.add(toDto(address)));
		return addressDtos;
	}
	
    public List<Address> fromDtos(List<AddressDTO> addressDtos){
		
		List<Address> address=new ArrayList<>();
		addressDtos.forEach(addressDto ->{
			try {
				address.add(fromDto(addressDto));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		return address;
	}
	
	public AddressDTO toDto(Address address) {
		
		AddressDTO addressDto=new AddressDTO();
		addressDto.setAddressType(address.getAddressType());
		addressDto.setId(address.getId());
		addressDto.setPinecode(address.getPinecode());
		addressDto.setState(address.getState());
		addressDto.setArea(address.getArea());
		addressDto.setDistrict(address.getDistrict());
		return addressDto;
		
	}
	
	public Address fromDto(AddressDTO addressDto) throws Exception {
		
		Address address=new Address();
		address.setAddressType(addressDto.getAddressType());
		address.setId(addressDto.getId());
		address.setPinecode(addressDto.getPinecode());
		address.setState(addressDto.getState());
		address.setArea(addressDto.getArea());
		address.setDistrict(addressDto.getDistrict());
	    return address;
	    
	}
	
}
