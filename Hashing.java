/*#******************************************************************************************************************
        # @purpose :Demonstrate Hashing Logic.
        # @file  :Hashing.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.io.*;
import java.util.*;
public class Hashing {
 LinkedList[]  list = new LinkedList[11];

 Scanner sc = new Scanner(System.in);
 public Hashing() {
	 int[] a = {23,45,12,68,17,10,56};
	 for(int i=0;i<a.length;i++) {
		 int rem = a[i]%11;
			  if(list[rem]==null) {
			list[rem] = new LinkedList();
			list[rem].add(a[i]);
		 }
			 else {
				 list[rem].add(a[i]);
			 }
	 } 
		 
 
		 for(int i=0;i<11;i++) {
			 System.out.println(i);
			 if(list[i]!=null) {
			System.out.println(list[i]);
			 
		 }
		 }
 }
 

		 public static void main(String[] args) {
			 Hashing hs = new Hashing();
		 }
		 
}
