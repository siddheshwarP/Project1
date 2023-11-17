package javaProgram;

import java.util.Scanner;

public class Array_InterchangeRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the lenth of array");
       int n =sc.nextInt();
       int A[][]=new int[n][n];
       System.out.println("enter the element of array");
       
       for(int i=0;i<A.length;i++) {
    	   for(int j=0;j<A.length;j++) {
    		   A[i][j]=sc.nextInt();
    	   }
       }
       System.out.println("The array elements are");
       for(int i=0;i<A.length;i++) {
    	   for(int j=0;j<A.length;j++) {
    		   System.out.print(A[i][j]+" ");
    	   }
    	   System.out.println();
       }
       
       for(int i=0;i<A.length;i++) {
    	   int temp=A[0][i];
    	   A[0][i]=A[1][i];
    	   A[1][i]=temp;
       }
       System.out.println("After interchanging array");
       for(int i=0;i<A.length;i++) {
    	   for(int j=0;j<A.length;j++) {
    		   System.out.print(A[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

}
