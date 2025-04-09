package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {
	// method override is happening here
	@Override
	public void iCar() {
		System.out.println("My car is a Audi!");
	}

	@Override
	public void iWheel() {
		System.out.println("My car has 4 wheels!");
	}

	@Override
	public void iDoor() {
		System.out.println("My car has 2 doors!");
	}

	@Override
	public void iEngine() {
		System.out.println("My car has motors!");
	}

	@Override
	public String iName() {
		String name = "Upskill";
		return name;
	}

	@Override
	public int iAge() {
		int age = 30;
		return age;
	}

	@Override
	public boolean iEV() {
		boolean ev = true;
		return ev;
	}

}
