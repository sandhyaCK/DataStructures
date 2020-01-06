package com.bridgelabz.creational.Factory;

public class Factory {

	private Factory() {
		
	}
	public static Computer get(String type,String cpu,String hdd,String ram) {
		if("Server".equals(type)) {
			return new Server(cpu,hdd,ram);
		}
		else if("pc".equals(type)){
			return new pc(cpu,hdd,ram);
		}
		else {
			return null;
		}
	}
}
