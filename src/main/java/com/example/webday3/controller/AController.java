package com.example.webday3.controller;

import java.text.DateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday3.dto.DetailDTO;
import com.example.webday3.model.Address;
import com.example.webday3.model.Person;
import com.example.webday3.service.AddressService;
import com.example.webday3.service.PersonService;
import com.example.webday3.transform.DetailTransform;

@RestController
public class AController {

	private PersonService personService;
	private AddressService addressService;
	private DateFormat df;

	@Autowired
	public AController(DateFormat df, PersonService personService, AddressService addressService) {
		this.df = df;
		this.personService = personService;
		this.addressService = addressService;
	}

	@GetMapping("/detail")
	public DetailDTO detail() {
		Person person = personService.getPerson();
		Address address = addressService.getAddress();
		DetailTransform dt = new DetailTransform(df);
		DetailDTO detailDTO = dt.apply(person, address);

		return detailDTO;
	}
}
