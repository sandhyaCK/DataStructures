/*#******************************************************************************************************************
        # @purpose :Demonstrate Palindrome for IntegerLogic.
        # @file  :Palindrome.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.util.*;
public class palindromeInt {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("number");
int k=sc.nextInt();
int r;int org = k;
int rev=0;
while(k!=0) {
	
	r=k%10;
	rev =rev*10+r;
	k/=10;
}
if(rev==org) {
	System.out.println("palindrome");
}else {
	System.out.println("not a palindrome");
}
}
}