/*#******************************************************************************************************************
        # @purpose :Demonstrate BankCounter Logic.
        # @file  :BankCounter.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
 import java.util.*;
public class BankCounter {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		Queue <Integer> q = new LinkedList();
		int ch = 0;
		int bal = 5000;
		q.size();
		do
		{ 
			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3.Number of people in the Queue ");
		   	System.out.println("4.Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice: ");
		   	int choice=sc.nextInt();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		 int a =sc.nextInt();
			   		q.add(a);
			   		bal = bal+a;
			   			System.out.println(q);
			   			
			   			System.out.println(" Your Available Balance is: " +bal ); 
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
					 int b=sc.nextInt();
			   		q.remove(b);
			   		bal=bal-b;
			   		System.out.println(" Your Available Balance is: " ); 
			   		System.out.println(bal);
			   		break;
			case 3:
					int j=q.size();
					System.out.println("The Number of People in Queue is: "+j);	
					System.out.println(q);
					break;
		   	case 4:
			   		System.exit(0);
		   	default: 
			   		System.out.println("You entered wrong choice");
			   		break;
		   	}
	   	}
		while(ch<5);	
	}

}
