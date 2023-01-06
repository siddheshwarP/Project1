package javaProgram;

public class StarPattern {

	public static void main(StringProgram[] args) {
		// TODO Auto-generated method stub
        int i,j;
        for(i=1;i<=5;i++) {
        	for(j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("pattern first finish");
        
        for(i=1;i<=5;i++) {
        	for(j=5;j>=i;j--) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=i;k++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("second pattern finish");
        
        for(i=1;i<=5;i++) {
        	for(j=5;j<=i;j++) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=i;k++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        System.out.println("-------");
        
        for(int row=1;row<=3;row++) {
        	for(int col=1;col<=row;col++) {
        		System.out.print(col);
        	}
        	
        	System.out.println();
        }
        System.out.println("number pattern");
        
        for(i=3;i>=1;i--) {
        	for(j=3;j>=i;j--) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
        System.out.println("pyramid pattern");
        
        for(i=1;i<=5;i++) {
        	for(j=i+1;j<=5;j++) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=i;k++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
     
        } 
	}


