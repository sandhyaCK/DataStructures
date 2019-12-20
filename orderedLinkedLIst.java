/*#******************************************************************************************************************
        # @purpose :Demonstrate OrderedLinkedList Logic.
        # @file  :OrderedLinkedList.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class orderedLinkedLIst {

	public static void main(String[] args) throws IOException{
		List<Integer> l=new LinkedList<>();
		File file = new File("/home/user/Desktop/file.txt");
		int a;
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
		a=sc.nextInt();	
	
		l.add(a);
		}
		{
		Collections.sort(l);
		System.out.println(l);
		}
		hasFunction(l);
	}
		
	

	private static void hasFunction(List<Integer> l) {
		if(l.contains(10)) {
			l.remove(10);
		}
		else {
		
		l.add(10);
		
	}
		Collections.sort(l);
System.out.println(l);
	
}
}