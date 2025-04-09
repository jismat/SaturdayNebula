package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 28;                                   //variable
		int [] ageFury = new int[]{25, 28, 30, 32, 21}; //Array //new means creating a new object //[] means creating an array

		//Array index             [0] [1] [2] [3] [4]
		
		System.out.println("Student Age: " + ageFury[1]);
		System.out.println("Total Length: " + ageFury.length); //showing the total number of arrays
		
		String[] nameFury = new String[]{"Protik", "Tahmina", "Mahfuz", "Shuvra", "Syed", "Zia"};
		
		System.out.println("Student Age: " + nameFury[3]);
		System.out.println("Total Length: " + nameFury.length); //showing the total number of arrays
		
		//Multi-Dimensional Array                   //this is how index works
		int[][] ageFury2D = {{25, 28, 30, 32, 21},  //[0][0] [0][1] [0][2] [0][3] [0][4]
				{24, 34, 32}};                      //[1][0] [1][1] [1][2]
		
		System.out.println("Student Age 2D: " + ageFury2D[1][1]);
		
		String[][] nameFury2D = new String[][]{{"Protik", "Tahmina", "Mahfuz", "Shuvra", "Syed", "Zia"},
											   {"Mahbub", "Esrat", "Sabiha"}};
		
		System.out.println("Student Name 2D: " + nameFury2D[1][2]);
		
		//Hashmap store multiple data using key-Value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>(); //creating hashmap object
		
		Student.put("Protik", 28); //putting the data
		Student.put("Tahmina", 24);
		Student.put("Zia", 21);
		Student.put("Roton", 31);
		
		System.out.println("HashMap Student Age: " + Student.get("Zia")); //getting the data
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka"); //putting the data
		Capital.put("USA", "NYC");
		
		System.out.println("Capital City: " + Capital.get("BD"));
		
		//HashTable store multiple data using key-value pair, no duplicate and synchronized
		
		Hashtable<String, String> Region = new Hashtable<String, String>(); 
		
		Region.put("BD", "Asia"); //putting the data
		Region.put("USA", "North America");
		
		System.out.println("HashTable Region: " + Region.get("BD")); //getting the data
		
		//HashTable store unordered collection containing unique value, implementation of Set interface
		
		HashSet<String> car = new HashSet<String>(); 
				
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
				
		System.out.println("Car: " + car);
		}
		
}
