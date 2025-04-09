package com.upskill.java_2;

public class Loopsjava2 {
	
public static void main(String [] args) {
	//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedForLoop();
}
	
	public static void practiceForLoop(){                       //For Loop - do again and again upto upper limit
		int i;                                                  //initialize the variable
		for(i=1; i<=10; i++){                                   //setting up Upper limit, increment or decrement
			System.out.println("For Loops number = " + i);      //statement
		}
	}
	public static void practiceWhileLoop(){                   //While Loop - do again and again until condition is matched
		int i= 1;                                             //initialize the variable
		while(i<10){                                          //setting condition
			System.out.println("While Loops number = " + i);  //statement
			i++;                                              //increment or decrement
		}	
	}
	public static void practiceDoWhileLoop(){                    //Do While Loop - do action then match condition 
		int i= 1;                                                //initialize the variable
		do{
			System.out.println("Do While Loops number = " + i);  //statement
			i++; 
		} while(i<=10);                                            //setting condition	
	}
	public static void practiceInfiniteLoop(){                   //Infinite Loop - never ending loop
		int i;                                                   //initialize the variable
		for(i=1; ; i++){                                         //setting lower limit, no upper limit, increment ot decrement
			System.out.println("Infinite Loops number = " + i);  //statement
		}	
	}
	public static void practiceNestedForLoop(){                    //Nested For Loop - never ending loop
		int i;                                                     //initialize i for loop 1
		int j;                                                     // initialize j for loop 2
		for(i=1; i<=10; i++){                                      //first loop for i
			for (j=0; j<=10; j++){                                 //second loop for j
				int multiplicationTable = i * j;
				System.out.print(multiplicationTable + " ");       //statement for second loop
			}
			System.out.println(" ");                               //statement for first loop
		}	
	}

}








