package com.springcore.auto.wire.copy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add1")
public class Address {
	@Value("pashan")
	private String street;
	@Value("pune")
	private String city;
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
