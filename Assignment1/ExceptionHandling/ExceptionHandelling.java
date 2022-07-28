//ASSIGNMENT-
//Q2. Write a java program which handle multiple 
package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandelling {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();

		try {
			if ((a - b) == 0) {
				throw new ArithmeticException();

			}
			int c = 100 / (a - b);
			System.out.println("c" + c);
			arr[5] = 55;
			System.out.println(arr[5]);

		} catch (ArithmeticException e) {
			System.out.println("IT is div by 0 Error");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("e"+e);
		}
		
		System.out.println("it is rough ");

	}
}
