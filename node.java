package com.Bridgelabz.DataStructures;



public class node {
	
	Node head;
	 public static class Node
	{
	public static final String val = null;
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
}
