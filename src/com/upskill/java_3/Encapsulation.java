package com.upskill.java_3;

public class Encapsulation {

	// Encapsulation used to hide the data using setter and getter method

	private String name = "upskill";         // Write & Read
	private int ssn = 524125;                // write only
	private String username = "raselalam";   // Read only

	// Setter Method - name                  //set the data, Write
	public void setName(String value) {
		name = value;
	}

	// Getter Method - name                  //get the date, Read
	public String getName() {
		return name;
	}
	
	//this is the classwork
	// Setter Method - ssn                   //set the data, Write
	public void setSSN(int value) {
		ssn = value;
	}

	//this is the classwork
	// Getter Method - ssn                   //get the date, Read
	public int getSSN() {
		return ssn;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		obj.setName("Rasel");
		System.out.println(obj.getName());
		
		//classwork
		System.out.println("SSN: " + obj.getSSN());
		obj.setSSN(123456789);
		System.out.println("New Set SSN: " + obj.getSSN());
	}

}
