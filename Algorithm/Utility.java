package com.BrigrLabz.algorithms;

public class Utility {
	public static void sort(int[]a) {
		 int n=a.length;
		
	for(int  i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(a[i]>a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j]=temp;
				
			}	
		}
	}	
	}
	public static void sort(String[] S1) {
		for(int i=0;i<S1.length;i++) {
			for(int j=0;j<S1.length-1-i;j++) {
				if(S1[j].compareTo(S1[j+1])<0) {
				String temp = S1[j];
				S1[j] = S1[j+1];
				S1[j+1] = temp;
				}
			}
		}
		
	}		
}
