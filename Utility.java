package com.Bridgelabz.DataStructures;

import java.util.Stack;

public class Utility {
	static int dayOfWeek(int m, int y) {
		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	static boolean isprime(int n) {
		int c=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
	                  c++;
					}
			}
			if(c==2) 
				return true;
				else 
			 return false;
			
	}
	static boolean palindromeInt(int k) {
		int r;int org = k;
		int rev=0;
		while(k!=0) {
			
			r=k%10;
			rev =rev*10+r;
			k/=10;
	}
		if(rev==org) {
			return true;
		}
return false;
}
	public static boolean check(String s1) {
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<s1.length();i++) {
		char c = s1.charAt(i);
		if(c=='(') {
			System.out.println(s.push(c));
		}
		else if(c==')') {
			s.pop();
		}
	
		}
		return true;
	
	}
	}
