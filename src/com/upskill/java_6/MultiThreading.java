package com.upskill.java_6;

public class MultiThreading {
	
	/*
	 Threads can be created by using 2 mechanisms:
	 
		1. Extending the Tread class
		2. Implementing Runnable Interface
		*/

	public static void main(String[] args) {
		
		int n=5;
		for(int i=0; i<n; i++){
			MultithreadingThread obj = new MultithreadingThread();
			obj.start();
			
			Thread obj2 = new Thread(new MultithreadingRunable());
			obj2.start();
		}
	}	
}
