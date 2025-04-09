package com.upskill.assignment_1;

public class problem_3 {

	public static void main(String[] args) {
			myMethod3();
			int a=9;
			int b=11;
			int c=myMethod3();
			System.out.println(a+b+c);
			
			//another way
			//addition
			int x = 9; //variable
			int y = 11;
			int v = calMulti(x, y);//return function

			int add = calAddtion(x, y);
			System.out.println("This is the value of addition: " + add);
			System.out.println("This is the value of multiplication: " + v);
			System.out.println("This is the total value: " + (v + add));
		}
		public static int myMethod3(){
			int a=9;
			int b=11;
			int c=a*b;
			return c;
		}	
			
		// addition
		public static int calAddtion(int x, int y) {
			return x + y;
		}

		// multiplication
		public static int calMulti(int x, int y) {
			return x * y;
		}

}
