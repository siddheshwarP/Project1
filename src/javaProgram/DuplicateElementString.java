package javaProgram;

public class DuplicateElementString {

	public static void main(String[] args) {
		
      String str="SeleniumAutomation";
      char ch[]= str.toCharArray();
      
      for(int i=0;i<ch.length;i++) {
    	  for(int j=i+1;j<ch.length;j++) {
    		  if(ch[i]==ch[j]) {
    			  System.out.println("Duplicate character is: "+ch[j]);
    			 
    		  }
    	  }
      }
	}

}
