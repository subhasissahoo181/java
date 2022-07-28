//ASSIGNMANT-5
/*Q6. Define an Interface ScientificCalculator, which is extended from the interface
Calculator(Q.5 ). Define the driver class, which create object reference of the interface
Calculator and perform all basic operation of the calculator and ScientificCalculator.*/

package Abstract_Interface.java;

interface ScientificCalculator extends Calculator1 {

	public void add(double a, double b);

	public void sub(double a, double b);

	public void mul(double a, double b);

	public void div(double a, double b);
}

class factorial {
	public void factorial(int a) {
		long factorial = 1;
		for (int j = a; j >= 1; j--) {
			factorial = factorial * j;
		}

	}

	public void swap(double a, double b) {

	}
}
