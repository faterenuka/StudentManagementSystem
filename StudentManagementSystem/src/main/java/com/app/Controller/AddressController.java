package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.assembler.AddressDTOAssembler;
import com.app.dto.AddressDTO;
import com.app.entity.Address;
import com.app.exception.AddressException;
import com.app.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@Autowired(required = true)
	AddressDTOAssembler addressAssembler;
	
	@GetMapping("address")
    public ResponseEntity<AddressDTO> getAddressById(@RequestParam Integer addressId) throws AddressException{
    	
    	Address address=addressService.getAddressById(addressId);
    	return new ResponseEntity<AddressDTO>(addressAssembler.toDto(address), HttpStatus.OK);
    }
	
	@PostMapping("address")
	public ResponseEntity<AddressDTO> addAddress(@RequestBody AddressDTO addressDto) throws Exception{
		
		Address address=addressAssembler.fromDto(addressDto);
		address=addressService.addAddress(address);
		return new ResponseEntity<AddressDTO>(addressAssembler.toDto(address), HttpStatus.CREATED);
	}
	
	@PutMapping("address")
	public ResponseEntity<AddressDTO> updateAddress(@RequestBody AddressDTO addressDto) throws Exception{
		
		Address address=addressAssembler.fromDto(addressDto);
		address=addressService.addAddress(address);
		return new ResponseEntity<AddressDTO>(addressAssembler.toDto(address), HttpStatus.OK);
	}
	
	@DeleteMapping("address")
	public ResponseEntity<AddressDTO>removeAddress(Integer addressId) throws AddressException{
		
		Address address=addressService.deleteAddress(addressId);
		return new ResponseEntity<AddressDTO>(addressAssembler.toDto(address), HttpStatus.OK);
	}
	
}
