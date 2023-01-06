package javaProgram;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		 
			  int num = 100, count;

			  for (int i = 2; i <= num; i++) {
			   count = 0;
			   for (int j = 2; j <= i-1; j++) {
			    if (i % j == 0) {
			     count++;
			     break;
			    }
			   }

			   if (count == 0) {
			    System.out.print(i+" ");
			   }

			  }
			 }
			}


