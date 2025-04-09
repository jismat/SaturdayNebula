package com.upskill.assignment_1;

public class problem_5 {

	public static void main(String[] args) {
		// student info
		displayStudentInfo("John", 30);
		displayStudentInfo("Tom", 20);
		displayStudentInfo("Mary", 10);
	
		//another way
		problem_5 myObject = new problem_5();
		myObject.myMethod51();
		
		myMethod52();
		
		int a= myMethod53();
		System.out.println("Age of z is "+a);

	}

	// separate method for each student using parameters
	public static void displayStudentInfo(String name, int age) {
		System.out.println("Name: " + name + ", Age: " + age);
	}
	
	//another way
	public void myMethod51(){
		int a=24;
		System.out.println("Age of X is "+a);
	}
	public static void myMethod52(){
		int a=25;
		System.out.println("Age of Y is "+a);
	}
	public static int myMethod53(){
		int a=26;
		return a;
	}

}
