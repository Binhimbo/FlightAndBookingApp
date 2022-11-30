package com.vhds.flightbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("flights")
public class Flight {

	@Id
	private String flightNumber;
	private String company;
	private String timeAndDay;
	private String transitTime;
	private boolean hasConnection;
	private int connectionAmount;
	private boolean luggageAllowed;
	private int price;
	
	public Flight(String flightNumber, String company, String timeAndDay, String transitTime, boolean hasConnection, int connectionAmount, boolean luggageAllowed, int price) {
		super();
		this.flightNumber = flightNumber;
		this.company = company;
		this.timeAndDay = timeAndDay;
		this.transitTime = transitTime;
		this.hasConnection = hasConnection;
		this.connectionAmount = connectionAmount;
		this.luggageAllowed = luggageAllowed;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Flight Number: "+this.flightNumber+" Company: "+this.company+" TimeAndDay: "+this.timeAndDay+" TransitTime: "+this.transitTime+" HasConnection: "+this.hasConnection+" ConnectionAmount: "+this.connectionAmount+" LuggageAllowed: "+this.luggageAllowed+" Price: "+this.price;
	}
	
}
