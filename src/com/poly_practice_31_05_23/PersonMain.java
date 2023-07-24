package com.poly_practice_31_05_23;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setId(101);
		p.setName("VedanG");
		p.setAdr(new Address());
		
		Address a = p.getAdr();
		a.setPin(413512);
		a.setCity("Latur");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(a.getPin());
		System.out.println(a.getCity());
				
		
		
		
	}

}
