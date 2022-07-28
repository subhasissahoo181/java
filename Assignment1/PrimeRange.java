
//Assignment 1
//Q8) Write a java program that will count the number of primes between 37 and 129.
import java.util.Scanner;

public class PrimeRange {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int  i, j, c=0, k=0;
//		System.out.println("Enter a number.");
//		a=Sc.nextInt();
		for(i=38; i<129; i++) {
			for(j=2; j<i; j++) {
				c=0;
				if(i%j==0) {
					c=1;
					break;
				}
			}
			if(c==0) {
				k++;
			}
		}
		System.out.println("Number of prime numbers ="+k);
	}
}
