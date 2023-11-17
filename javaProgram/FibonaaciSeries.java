package javaProgram;

public class FibonaaciSeries {

	public static void main(String[] args) {
		
		int num=5;
		int a=0,b=1,c;
		
		for(int i=1;i<=num;i++) {
			
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}

	}

}
