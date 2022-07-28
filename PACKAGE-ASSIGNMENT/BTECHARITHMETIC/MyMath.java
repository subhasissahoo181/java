//ASSIGNMANT PACKAGE
/* Q2.Create a sub-package called arithmetic under the package btech. The arithmetic
package should contain a class MyMath having methods to deal with different
arithmetic operations (addition, subtraction, multiplication, division and mod). 
Create a class Test containing the main method which will use the methods of sub- package arithmetic*/
//FIRST CLASS
package BTECHARITHMETIC;

public class MyMath {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int multi(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int mod(int a, int b) {
		return a % b;
	}
}
