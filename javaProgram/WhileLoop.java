package javaProgram;

public class WhileLoop {

	public static void main(StringProgram[] args) {
		// TODO Auto-generated method stub
      int r=1,c=0,n=5;
      while(r<=n) {
    	  while(c<=r-1) {
    		  System.out.print("* ");
    		  c++;
    	  }
    	  r++;
    	  c=0;
    	  System.out.println();
      }
	}

}
