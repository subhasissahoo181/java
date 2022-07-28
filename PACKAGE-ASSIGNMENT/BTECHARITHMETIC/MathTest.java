//ASSIGNMANT PACKAGE
/* Q2.Create a sub-package called arithmetic under the package btech. The arithmetic
package should contain a class MyMath having methods to deal with different
arithmetic operations (addition, subtraction, multiplication, division and mod). 
Create a class Test containing the main method which will use the methods of sub- package arithmetic*/
//SECOND CLASS
package BTECHARITHMETIC;

import java.util.Scanner;

public class MathTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		MyMath m = new MyMath();
		System.out.println("\n Enter Two no. (1st no is greater than 2nd no.) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("\n Sum of two no. = " + m.add(x, y));
		System.out.println("\n Subtraction of two no. = " + m.sub(x, y));
		System.out.println("\n Productof two no. = " + m.multi(x, y));
		System.out.println("\n Division of two no. = " + m.div(x, y));
		System.out.println("\n Modulus of two no. = " + m.mod(x, y));
	}
}
