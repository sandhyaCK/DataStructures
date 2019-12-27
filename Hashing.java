/*#******************************************************************************************************************
        # @purpose :Demonstrate Hashing Logic.
        # @file  :Hashing.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.io.*;
import java.util.*;
public class Hashing {
 @SuppressWarnings("unchecked")
List<Integer>  list[] = new LinkedList[11];


 public Hashing() throws FileNotFoundException {
	 File file = new File("/home/user/Desktop/file.txt");
	 FileReader reader = new FileReader(file);
	 		BufferedReader br = new BufferedReader(reader);
	 int[] a =new int[10];
	 Scanner sc = new Scanner(file);
	 while(sc.hasNext()) {
		 int i=0;
	     a[i] =sc.nextInt();
		// int b = sc.nextInt();
	     System.out.println(a[i] +" ");
		  i++;
	 }
	 for(int i=0;i<a.length;i++) {
		 int rem = a[i]%11;
		 list[rem] = new LinkedList<Integer>();
			  if(list[rem]==null) {
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
 public static void main(String[] args) throws FileNotFoundException {
			 Hashing hs = new Hashing();
		 }
		 
}
