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
		System.out.println(s.push(s1.charAt(i)));
	}
	else if(c==')') {
		s.pop();
	}
}
	return s.isEmpty();
}
	public static void main(String[] args) {
	
		/*s.isEmpty();
		System.out.println(s);
		s.push('(');
		s.push(5);
		s.push('+');
		s.push(6);
		s.push(')');
		s.pop();
		s.push('*');
		s.push('(');
		s.push('7');
		s.push('+');
		s.push('8');
		s.push(')');
		s.pop();
		s.push('/');
		s.push('(');
		s.push(4);
		s.push('*');
		s.push(3);
		s.push(')');
		s.pop();
		s.push('(');
		s.push(5);
		s.push('+');
		s.push(6);
		s.push(')');
		s.pop();
		s.push('(');
		s.push('7');
		s.push('+');
		s.push('8');
		s.push(')');
		s.pop();
		s.push('/');
		s.push('(');
		s.push(4);
		s.push('*');
		s.push(3);
		s.push(')');
		s.pop();
		 System.out.println(s.size());
	System.out.println(s);	*/
		String s1 = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		String result = (check(s1)) ? "balanced" : "not balanced";
		System.out.println(result);
	}

}
