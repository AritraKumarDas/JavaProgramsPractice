package com.person;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private int personID;

	private String personName;

	private String personCity;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personID, String personName, String personCity) {
		super();
		this.personID = personID;
		this.personName = personName;
		this.personCity = personCity;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

}
