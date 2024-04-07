package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String city;

	@OneToOne(mappedBy = "address")
	private Employee emp;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city) {
		super();

		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", emp=" + emp.getEmpName() + " - " + emp.getDepartmnent()
				+ "]";
	}

}
