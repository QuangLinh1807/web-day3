package com.example.webday3.repository.impl;

import org.springframework.stereotype.Repository;

import com.example.webday3.model.Address;
import com.example.webday3.repository.AddressRepository;

@Repository
public class AddressRepositoryImpl implements AddressRepository {

	@Override
	public Address getAddress() {
		Address a = new Address();
		a.setCity("Ha Noi");
		a.setStreet("Ho Tung Mau");

		return a;
	}

}
