package com.upskill.java_5;

public interface Interface {
	
	public abstract void iCar();
	
	public abstract void iWheel();
	
	public abstract void iDoor();
	
	public abstract void iEngine();
	
	public abstract String iName();
	
	public abstract int iAge();
	
	public abstract boolean iEV();
}


/*
(Parent)            (Keyword)           (Child)                   (Keyword)         (GrandChild)
Class (0)			 extends			Class (0)			
Abstract Class (A7)  extends            Class (A7-R7=0)
Interface (A7)       implements         Class (A7-R7=0)
Interface (A7)		 extends			Interface (A7)            implements         Class (A7-R7=0)
Interface (A7)		 implements			Abstract Class (A7-R7=0)  extends            
Abstract Class (A7)  extends            Interface (A7-R7=0)		  implements         Class (A7-R7=0)
*/