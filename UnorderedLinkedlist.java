/*#******************************************************************************************************************
        # @purpose :Demonstrate UnOrderedLinkedList Logic.
        # @file  :UnOrderedLinkedList.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
public class UnorderedLinkedlist {

	Node head;
	 public static class Node
	{
	String data;
		Node next;
		Node(String i){
			this.data = i;
			next = null;
		}
		}
		 void display() {
			Node n = head;
			while(n!=null) {
				System.out.println(n.data + " ");
				n=n.next;
			}
		}
	public static void main(String[] args) throws IOException {

File file = new File("/home/user/Desktop/files.txt");

UnorderedLinkedlist list=new UnorderedLinkedlist();
BufferedReader br = new BufferedReader(new FileReader(file));
String st[] = new String[100];
while((br.readLine())!=null) {
for(int i=0;i<file.length();i++) {
	st[i] = br.readLine();
}}
list.head=new Node(st[0]);
Node second=new Node(st[1]);
Node third = new Node(st[2]);
Node fourth=new Node(st[3]);
Node aa = new Node(st[4]);
list.head.next = second;
second.next=third;
third.next=fourth;
list.display();
/*if(list.equals("SHASHI")) {
	Node bb = new Node("MANJU");
	third.next = bb;
	list.display();

	
}*.*/
}

	}
