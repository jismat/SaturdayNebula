package com.upskill.assignment_1;

public class problem_4 {

	public static void main(String[] args) {
		int num1 = function1();
		int num2 = function2();

	    int result = subtractLargeToSmall(num1, num2);
		System.out.println("This is the value of subtraction: " + result);
		
		//another way
				function1(); 
				function2();
				int a=function1();
				int b=function2();
				System.out.println(b-a);

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
		
}
