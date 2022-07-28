//ASSIGNEMTN-
/*Q1. Write a java program, which read two numbers a and b and compute a/(a-b). The program
should check the value of (a-b) before dividing with a, it should throw an exception if (a-b) is
zero. In the exception handler the program should display appropriate message to the user.*/
package ExceptionHandling;

public class Exception1 {
	public static void main(String args[]) {
		int a= 5;
		int b=5;
		try {
			int c=a-b/0;
			System.out.println("c="+c);
		}
		catch(ArithmeticException e ){
			System.out.println(e);
		}
	}
}
