package com.upskill.assignment_1;

public class java_assignment_1 {

	public static void main(String[] args) {
		//triangle
		int arm1 = 5;
		int arm2 = 7;
		int arm3 = 11;

		int p = calculatePerimeterTriangle(arm1, arm2, arm3);
		System.out.println("The Perimeter of the Triangle is: " + p);

		//rectangle
		int side1 = 9;
		int side2 = 13;
		int side3 = 9;
		int side4 = 13;

		int p2 = calculatePerimeterRectangle(side1, side2, side3, side4);
		System.out.println("The Perimeter of the Rectangle is: " + p2);

		//addition
		int a = 9; //variable
		int b = 11;
		int v = calMulti(a, b);//return function

		int add = calAddtion(a, b);
		System.out.println("This is the value of addition: " + add);
		System.out.println("This is the value of multiplication: " + v);
		System.out.println("This is the total value: " + (v + add));

		//subtraction
		int num1 = function1();
		int num2 = function2();

	    int result = subtractLargeToSmall(num1, num2);
		System.out.println("This is the value of subtraction: " + result);
		
		//student info
		displayStudentInfo("John", 30);
		displayStudentInfo("Tom", 20);
		displayStudentInfo("Mary", 10);

	}

	// triangle
	public static int calculatePerimeterTriangle(int arm1, int arm2, int arm3) {
		return arm1 + arm2 + arm3;
	}

	// rectangle
	public static int calculatePerimeterRectangle(int side1, int side2, int side3, int side4) {
		return side1 + side2 + side3 + side4;
	}

	// addition
	public static int calAddtion(int a, int b) {
		return a + b;
	}

	// multiplication
	public static int calMulti(int a, int b) {
		return a * b;
	}

	// return function
	public static int function1() {
		return 30;
	}

	public static int function2() {
		return 50;
	}

	//subtract function with if condition
	public static int subtractLargeToSmall(int a, int b) {
		if (a > b) {
			return a - b;
		} else {
			return b - a;
		}
	}
	
	//separate method for each student using parameters
	public static void displayStudentInfo(String name, int age) {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}
