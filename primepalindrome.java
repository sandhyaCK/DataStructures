
/*#******************************************************************************************************************
        # @purpose :Demonstrate PrimePalindromeLogic.
        # @file  :PrimePalindrome.java
        # @author :Sandhya
   #***************************************************************************************************************/package com.Bridgelabz.DataStructures;

   import java.util.*;
   import com.Bridgelabz.DataStructures.*;
public class primepalindrome {

	public static void main(String[] args) {
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
if(Utility.isprime(k)==true) {
	if(Utility.palindromeInt(k)==true) {
b[i]=k;
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
		 