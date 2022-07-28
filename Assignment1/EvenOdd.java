//Assignment 1
//Q2) Write a java program, that will take input as number and check it is even or odd. 

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		int a;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number to check weather a number is Even or Odd.");
		a = Sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("The number is Even.");
		} else {
			System.out.println("The number is odd.");
		}

	}

}
