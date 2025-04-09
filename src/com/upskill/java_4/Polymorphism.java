package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{ //extend means inheritance
	
	

	public static void main(String[] args) { 
		car(); //this will call the first method "car"
		car(5); //this will call the 2nd method "car(int seat)"
		car("Red"); //this will call the 3rd method "car(String color)"
		car(true);
		car("Dual", 4);
		
		//this is inheriting from MethodType class
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}
	
	//-Method Overridding - Same method name from Parent class to override - runtime polymorphism
	//void method
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome*2000;
		int rentalIncome = 30000;
		int bonus = 20000;
		int sideHussel = 25000;
		int newIncome = calculateAnnualIncome + rentalIncome + bonus + sideHussel;
		System.out.println("My Annual Income: " + newIncome);
	}
	
	//-Method Overloading - Same method name with different signature to overload - compile time polymorphism
	public static void car() {
		System.out.println("My car is Tesla");
	}
	
	public static void car(int seat) {
		System.out.println("My car is Tesla, " + "it has seat: " + seat);
	}
	
	public static void car(String color) {
		System.out.println("My car is Tesla, " + "it has color: " + color);
	}
	
	public static void car(Boolean ev) {
		System.out.println("My car is Tesla, " + "it is EV: " + ev);
	}
	
	public static void car(String motor, int wheel) {
		System.out.println("My car is Tesla, " + "it has motor: " + motor + ", it has wheel: " + wheel);
	}

}
