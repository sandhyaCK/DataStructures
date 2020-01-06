package com.bridgelabz.creational.Factory;

public class pc extends Computer {
public String cpu;
public String hdd;
public String ram;
public pc(String cpu,String hdd,String ram) {
	this.cpu=cpu;
	this.hdd=hdd;
	this.ram=ram;
}
public String getCPU() {
		
		return this.cpu;
	}

	public String getHDD() {
		
		return this.hdd;
	}

	public String getRAM() {
		
		return this.ram;
	}
	

}
