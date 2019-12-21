package com.Bridgelabz.DataStructures;
import java.util.*;
public class primepalindrome {
boolean isprime(int n) {
	int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
                  c++;
				}
		}if(c==2) 
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
	int p = sc.nextInt();
	System.out.println("enter the no of rows");
	int M = sc.nextInt();
	System.out.println("enter the no of rows");
	int N = sc.nextInt();
	int a[][]=new int[M][N];
	int b[]=new int[m*p];
	
int i = 0,j=0;int k=1;int rev=0; int r; int org;
while(i<m*p) {
if(ob.isprime(k)==true) {
	 org=k;
	while(k!=0) {
	r=k%10;
	rev=(rev*10)+r;
	k=k/10;
	}	
if(org==rev){
b[i]=org;
}
k++;
}
i++;
}

int x=0;
for(i=0;i<M;i++) {
	for(j=0;j<N;j++) {
		a[i][j] = b[x];
		
		x++;
		System.out.print(a[i][j] + "  ");
	}
	System.out.println();
}

	
	}
}
		 