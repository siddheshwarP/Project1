package javaProgram;

public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int A[][]=new int[3][];
           
            A[0]= new int [3];
            A[1]= new int [4];
            A[2]= new int [2];
            int count=0;
            for(int i=0;i<A.length;i++) {
            	for(int j=0;j<A[i].length;j++) {
            		A[i][j]=count++;
            		
            	}
            }
            for(int i=0;i<A.length;i++) {
            	for(int j=0;j<A[i].length;j++) {
            		System.out.print(A[i][j]+" ");
            	}
            	System.out.println();
	}

}
}