package com.bridgelabz.creational.Factory;

public class Server extends Computer{
	public String cpu;
	public String hdd;
	public String ram;
	public Server(String cpu,String hdd,String ram) {
		this.cpu=cpu;
		this.hdd=hdd;
		this.ram=ram;
	}public String getCPU() {
			
			return this.cpu;
		}

		public String getHDD() {
			
			return this.hdd;
		}

		public String getRAM() {
			
			return this.ram;
		}
}
