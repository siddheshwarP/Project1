package javaProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		int A =21;
		int count=0;
		
		for(int i=1;i<=A;i++) {
			if(A%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println("This is prime number");
		}
		else {
			System.out.println("This is not prime number");
		}
      
	}

}
