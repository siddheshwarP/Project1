package javaProgram;

public class IfStatement {
   
	public static void main(StringProgram[] args) {
		 int amolAge =40;
		 int aanandAge =40;
		
		 if(amolAge<1||aanandAge<1) {
			 System.out.println("please enter valid age");
		 }
		 else if(aanandAge<amolAge) {
			 System.out.println("aanand is younger than amol");
		 }
		 else if(amolAge<aanandAge) {
			 System.out.println("amol is younger than aanand");
		 }
		 else if(amolAge==aanandAge) {
			 System.out.println("Both are having same age");
		 }
	}
}


