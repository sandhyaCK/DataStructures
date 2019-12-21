/*#******************************************************************************************************************
        # @purpose :Demonstrate 2Dprime Logic.
        # @file  :Prime.java
        # @author :Sandhya
   #***************************************************************************************************************/
package com.Bridgelabz.DataStructures;
import java.util.*;
public class prime2d {	
	boolean isprime(int n) {
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

	
		public static void main(String[] args) {
		primepalindrome ob = new primepalindrome();	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int m = sc.nextInt();
		System.out.println("enter the no of columns");
		int d = sc.nextInt();
		int a[][]=new int[m][d];
		int b[]=new int[m*d];
		
	int i = 0,j=0;int k=1;
	while(i<m*d) {
	if(ob.isprime(k)==true) {
	b[i]=k;
	i++;
	}
	k++;
	}

	int x=0;
	for(i=0;i<m;i++) {
		for(j=0;j<d;j++) {
			a[i][j] = b[x];	
			x++;
			System.out.print(a[i][j] + "  ");
		}
		System.out.println();
	}

		
		}
	}

