//Assignment 1
//Write a Java program that will evaluate the sin(x) series. (Hints Use Taylor series expansion) i.e sin(X) = X – X^3/3! + X^5/5! - …………

import java.util.Scanner;
public class Sin {
	public static void main(String ar[]){
		Scanner obj = new Scanner(System.in);
		int n;
		double x;
		System.out.print("Value of x: ");
		x = obj.nextDouble();
		x = (3.14159/180)*x;
		double term = x;
		double result = x;
		System.out.print("Number of terms: ");
		n = obj.nextInt();
		for (int i = 1; i<n; i = i+1){
			term = -term*x*x/(2*i*(2*i+1));
			result += term;
		}
		System.out.print("Sum of sinx series is: "+result);
	}


}

