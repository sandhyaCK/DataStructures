package com.bridgeLabz.ObjectOriented;
import java.util.*;
import com.bridgeLabz.ObjectOriented.*;
public class StockUserDetails {
public static StockDetails companyDetails(String companyName) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company Name");
		String Name =sc.next();
		System.out.println("Enter Company Symbol");
		String companySymbol = sc.next();
		System.out.println("Enter NumberOfShare");
		int numberOfShare =sc.nextInt();
		System.out.println("Enter Price");
		double price = sc.nextDouble();
	    StockDetails companyShare = new StockDetails(companyName,companySymbol,numberOfShare,price);;
		return companyShare;
	}
	
}
