package com.bridgelabz.creational.Factory;

public abstract class Computer {
public abstract String getCPU();
public abstract String getHDD();
public abstract String getRAM();
public String toString() {
	return "[getCPU"+"" +getCPU()+" " +"getHDD" +" "+getHDD()+" " +"getRAM"+" "+getRAM() +"]";
	
}
}
