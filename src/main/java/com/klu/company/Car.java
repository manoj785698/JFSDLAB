package com.klu.company;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicle {

	private int seats;
	private String fuelType;

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

}
