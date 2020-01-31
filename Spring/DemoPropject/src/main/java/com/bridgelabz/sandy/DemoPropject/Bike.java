package com.bridgelabz.sandy.DemoPropject;

public class Bike {
	//String Name;
	public Tyre tyre;
	public Parts parts;
	
public void setParts(Parts parts) {
		this.parts = parts;
	}

//	public Bike(String Name) {
//		this.Name = Name;
//	}	
public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

public void drive() {
	System.out.println("Its riding");
	//System.out.println(Name);
	tyre.display();
	parts.parts();
}
}
