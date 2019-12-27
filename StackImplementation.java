/*#******************************************************************************************************************
        # @purpose :Demonstrate BalancedParanthesis Logic.
        # @file  :BalancedParentheses.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.util.*;

public class StackImplementation {
public static boolean check(String s1) {
	Stack<Character> s = new Stack();

	for(int i=0;i<s1.length();i++) {
	
	char c = s1.charAt(i);
	if(c=='(') {
		System.out.println(s.push(c));
	}
	else if(c==')') {
		s.pop();
	}
}
	return s.isEmpty();
}
	public static void main(String[] args) {
	
		
		String s1 = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		String result = (check(s1)) ? "balanced" : "not balanced";
		System.out.println(result);
	}

}
