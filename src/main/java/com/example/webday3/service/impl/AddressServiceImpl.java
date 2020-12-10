package com.example.webday3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webday3.model.Address;
import com.example.webday3.repository.AddressRepository;
import com.example.webday3.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;

	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public Address getAddress() {
		return addressRepository.getAddress();
	}
}
