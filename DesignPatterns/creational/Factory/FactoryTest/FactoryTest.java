package com.bridgelabz.creational.Factory;
import com.bridgelabz.creational.Factory.*;
public class FactoryTest {
 public static void main(String[] args) {
	 Computer c1 = Factory.get("pc","4GB","500GB","4.5HZ");
	 Computer c2 =  Factory.get("Server","10gb","600GB","8.75HZ");
	 System.out.println(c1);
	 System.out.println(c2);
	 
 }
}
