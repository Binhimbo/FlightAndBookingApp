package com.vhds.spring.passengerbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("passengers")
public class Passenger {
	@Id
	private String idNumber;
	private String name;
	private String surname;
	private String nationality;
	private int age;
	private boolean hasBaggage;

	public Passenger(String idNumber, String name, String surname, String nationality, int age, boolean hasBaggage) {
		super();
		this.idNumber = idNumber;
		this.name = name;
		this.surname = surname;
		this.nationality = nationality;
		this.age = age;
		this.hasBaggage = hasBaggage;
	}

	@Override
	public String toString() {
		return "id: " + this.idNumber + " name: " + this.name + " surname: " + this.surname + " nationality: "
				+ this.nationality + " age: " + this.age + " hasBaggage: " + this.hasBaggage;
	}
}
