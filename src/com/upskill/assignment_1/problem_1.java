package com.upskill.assignment_1;

public class problem_1 {
	
	public static void main(String[] args) {
		calculatePerimeterTriangle();
	}
	
	public static void calculatePerimeterTriangle() {
		int arm1 = 5;
		int arm2 = 7;
		int arm3 = 11;

		int p = arm1 + arm2 + arm3;
		System.out.println("The Perimeter of the Triangle is: " + p);
	}
}
