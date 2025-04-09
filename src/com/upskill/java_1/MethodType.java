package com.upskill.java_1;

public class MethodType {
//	Types of Methods
//	1. Void Method
//	2. Static Method
//	3. Return Type Method;
	
	public static int hourlyIncome =  65;
	
	//Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome*2000;
		System.out.println("My Annual Income: " + calculateAnnualIncome);
	}
	//Return Type Method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome*180;
		System.out.println("My Monthly Income: " + calculateMonthlyIncome);
		return calculateMonthlyIncome;
	}
	
	//Static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome*40;
		System.out.println("My Weekly Income: " + calculateWeeklyIncome);
	}
	
	//Calling the methods here
	public static void main(String[] args){
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		obj.monthlyIncomeReturn();
		weeklyIncomeStatic();
		
		
	}
}




