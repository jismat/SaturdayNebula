package com.upskill.java_5;

public abstract class AbstractClass {
	//Abstraction means implementation is hidden. Encapsulation means data is hidden
	public abstract void iCar();
	
	public abstract void iWheel();
	
	public abstract void iDoor();
	
	public abstract void iEngine();
	
	public abstract String iName();
	
	public abstract int iAge();
	
	public abstract boolean iEV();
	
	public String name(){
		String name = "Upskill";
		return name;
	}
	
	public int age(){
		int age = 30;
		return age;
	}
	
	public boolean ev(){
		boolean ev =true;  
		return ev;
	}
	
	public void car(){
		System.out.println("My car is a Tesla!");
	}
}
