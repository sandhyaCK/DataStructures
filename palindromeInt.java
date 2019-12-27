/*#******************************************************************************************************************
        # @purpose :Demonstrate Palindrome for IntegerLogic.
        # @file  :Palindrome.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.util.*;
import com.Bridgelabz.DataStructures.*;
public class palindromeInt {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("number");
int k=sc.nextInt();
if(Utility.palindromeInt(k)==true){
 System.out.println("palindrome");
}else {
	System.out.println("not a palindrome");
}
}
}