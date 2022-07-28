//Assignment 1
//Q6) Write a Java program that will evaluate the exponential series. 
 //i.e. ex= 1+ X + X^2/2! + X^3/3!+............
import java.util.Scanner;
import java.lang.*;
public class Exponential {
	public static void main (String args[]) {
		Scanner Sc = new Scanner(System.in);
		int n, x, i, j;
		double sum=0;
		System.out.println("Enter the value of x and Number of terms. ");
		n=Sc.nextInt();
		x=Sc.nextInt();
		for(i=0; i<n; i++) {
			int fact=1;
			for(j=0; j<i; j++) {
				fact=fact*j;
				sum= sum+Math.pow(x,i)/fact;
			}			
		}
		System.out.println("Sum="+sum);
		
	}
}
