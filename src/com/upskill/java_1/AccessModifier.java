package com.upskill.java_1;

public class AccessModifier {
		
	public String name = "John"; //public - any class can access
	
	private int age = 30; //private - only same class can access
	
	protected int ssn = 123456789; 	//protected - classes are in the same package and subclasses

		String address = "XYZ Tower"; 	//default - classes are in the same package can access

}
