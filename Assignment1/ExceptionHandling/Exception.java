//ASSIGNEMTN-
/*Q1. Write a java program, which read two numbers a and b and compute a/(a-b). The program
should check the value of (a-b) before dividing with a, it should throw an exception if (a-b) is
zero. In the exception handler the program should display appropriate message to the user.*/package ExceptionHandling;
import java.util.Scanner;

public class Exception {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		
		try {
			if((a-b)==0 ){
				throw new ArithmeticException();
				
			}
			int c = 100/(a-b);
			System.out.println("c"+c);
		}
		catch(ArithmeticException e) {
			System.out.println("IT is div by 0");
		}
		System.out.println("it is rough ");
		
	}
	

}
