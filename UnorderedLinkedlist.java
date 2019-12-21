/*#******************************************************************************************************************
        # @purpose :Demonstrate UnOrderedLinkedList Logic.
        # @file  :UnOrderedLinkedList.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.util.*;
import java.io.*;
public class UnorderedLinkedlist {

	public static void main(String[] args) throws IOException {
		
		
		LinkedList<String> l=new LinkedList<>();
		File file = new File("/home/user/Desktop/files.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while((st=br.readLine())!=null) {
			
			
		
		l.add(st);
		}
		System.out.println(l);
		
		if(l.contains("ccc")) {
			l.remove("cccc");
		}
		else {
	 l.add("ssss");
		}
		System.out.println(l);
		
}}
