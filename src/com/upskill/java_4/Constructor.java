package com.upskill.java_4;

public class Constructor {
	
	//Constructor is instance of class, method same as class name, java will execute constructor first
//	- Constructor cannot be static or override nor void or return type.
//	- Default constructor: No constructor is initialized.
//	- Parameterized constructor: add different signature
//	- Constructor overloading: Different signature
	
	String studentName;
	int studentAge;
	
	public Constructor(String name){
		studentName = name;
	}
	
	public Constructor(int age){ //this is constructor overloading
		studentAge = age;
	}

	public Constructor(String name, int age){
		studentName = name;
		studentAge = age;
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor(28);
		System.out.println("Age object 1:"+ obj.studentAge);
		
		Constructor obj2 = new Constructor("Rajesh", 28);
		System.out.println("Age Object 2:"+obj2.studentAge);
		System.out.println("Age Object 2:"+obj2.studentAge);
	}
		
	}
