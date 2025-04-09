package com.upskill.assignment_1;

public class problem_2 {
	
	public static void main(String[] args) {
		calculatePerimeterRectangle();
	}
	
	public static void calculatePerimeterRectangle() {
		int side1 = 9;
		int side2 = 13;
		int side3 = 9;
		int side4 = 13;

		int p = side1 + side2 + side3 + side4;
		System.out.println("The Perimeter of the Rectangle is: " + p);
		
		//another option
		int p2 = 2*(side1 + side2);
		System.out.println("The Perimeter of the Rectangle is: " + p2);
	}
}
