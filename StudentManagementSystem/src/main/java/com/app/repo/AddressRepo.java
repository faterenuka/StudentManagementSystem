package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
