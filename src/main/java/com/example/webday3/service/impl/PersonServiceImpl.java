package com.example.webday3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webday3.model.Person;
import com.example.webday3.repository.PersonRepository;
import com.example.webday3.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	private PersonRepository personRepository;

	@Autowired
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Person getPerson() {
		return personRepository.getPerson();
	}
	
	
}
