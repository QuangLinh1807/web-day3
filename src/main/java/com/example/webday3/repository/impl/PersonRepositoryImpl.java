package com.example.webday3.repository.impl;

import java.util.Calendar;

import org.springframework.stereotype.Repository;

import com.example.webday3.model.Person;
import com.example.webday3.repository.PersonRepository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public Person getPerson() {
		Person p = new Person();
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, 11, 31);
		p.setDob(calendar.getTime());

		return p;
	}
}
