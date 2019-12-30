/*#******************************************************************************************************************
        # @purpose :Demonstrate Anagram Logic.
        # @file  :Anagram.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.BrigrLabz.algorithms;
import java.util.*;
import com.BrigrLabz.algorithms.*;
public class Anagram {	
	public static void main(String[] args) {
		System.out.println("Enter s1 AND S2");
	 String s1 = Utility.readingString();
	 String s2 = Utility.readingString();
	
	if(Utility.checkAnagram(s1,s1)==true){
		System.out.println("anagrams");
	}		else {
	System.out.println("not anagram");
		}
	/* for(int i=0;i<s1.length;i++) {
		 System.out.println(s1[i]);*/
	 }

	}
		
				
		
	
	
	
	
	
	
	
	/*if(s1.length!=s2.length) {
		System.out.println("not A anagram");
	}
	for(int i=0;i<s1.length;i++) {
		for(int j=0;j<s2.length;j++) {
			while(s1[i]=s2[i]) {
				count++;
			}
			else {
				count++;*/
		
