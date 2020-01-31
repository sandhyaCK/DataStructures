package com.bridgelabz.sandy.DemoPropject;

public class Tyre {
	
	private String Brand; 
	private int NoOfWheels;

	public void setBrand(String brand) {
		Brand = brand;
	}

	public void setNoOfWheels(int noOfWheels) {
		NoOfWheels = noOfWheels;
	}

	
	public void display() {
		System.out.println("NoOfWheels :" + NoOfWheels);
		System.out.println("Brand :" +Brand);
	}
}
