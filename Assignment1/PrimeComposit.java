//Assignment 1
//Q4) Write a Java program to test the inputted number is prime or composite.
import java.util.Scanner;
public class PrimeComposit {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int a, i, b=0;
		System.out.println("Enter the number to check weather it is prime or not.");
		a = Sc.nextInt();
		for( i=2; i<a; i++) {
			if(a%i==0) {
				b=1;
				break;
			}
		}
			
			 if(b==0) {
				System.out.println("It is a prime number.");
			}
			else 
				System.out.println("It is a Composite number.");
			
	}

}
