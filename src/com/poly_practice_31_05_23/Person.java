package com.poly_practice_31_05_23;

public class Person {
	
	private int id;
	private String name;
	Address adr;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}

}

 class Address{
	
	private int pin;
	private String city;
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setCity(String city) {
		this.city = city;
		
	}
	
	public String getCity() {
		return city;
	}
	
	
}
