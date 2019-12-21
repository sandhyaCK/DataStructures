/*#******************************************************************************************************************
        # @purpose :Demonstrate PalindromeChecker Logic.
        # @file  :PalindromeChecker.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.util.*;

public class PalindromeChecker {
public static void main(String[] args) {
	Queue d =  new LinkedList ();
	String a = "racar";
	for(int i=a.length()-1;i>=0;i--) {
	    d.add(a.charAt(i));
	}
	String rev = "";
	while(!d.isEmpty()) {
		rev = rev+d.remove();
	}
	if(a.equals(rev)){
	  System.out.println("given string is a palindome");
	}
	else {
		System.out.println("not a palindrome");
}
}}