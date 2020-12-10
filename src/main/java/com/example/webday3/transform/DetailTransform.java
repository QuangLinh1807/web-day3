package com.example.webday3.transform;

import java.text.DateFormat;

import com.example.webday3.dto.DetailDTO;
import com.example.webday3.model.Address;
import com.example.webday3.model.Person;

public class DetailTransform {

	private DateFormat df;

	public DetailTransform(DateFormat df) {
		this.df = df;
	}

	public DetailDTO apply(Person p, Address a) {
		DetailDTO detailDTO = new DetailDTO();

		detailDTO.setName(p.getName());
		detailDTO.setDob(df.format(p.getDob()));
		detailDTO.setCity(a.getCity());
		detailDTO.setStreet(a.getStreet());

		return detailDTO;
	}
}
