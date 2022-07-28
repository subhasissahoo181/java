//ASSIGNMENT
/*Q3. Write a java program , where the exception throws from a function and handle by the
called function. Placed the finally block in both the function.*/
package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandeling3 {

	public static void main(String[] args) {

		Bla ob1 = new Bla();

		try {
			ob1.run(3, 3);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Try again!");
		}

	}

}

class Bla {
	public void run(int a, int b) throws ArithmeticException {
		if (a - b == 0) {
			throw new ArithmeticException("substraction of two numbers should not be zero");
		}
		System.out.println(a - b / 2);

	}
}




