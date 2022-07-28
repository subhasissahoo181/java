//ASSIGNMANT-5
/*Q5. Define an interface Calculator which has the basic methods add(), sub( ), mul() and div(). Define a concrete class named as DemoCalculator that implements the interface. Define the
driver class, which create object reference of the interface Calculator and perform all basic
operation of the calculator.
*/
package Abstract_Interface.java;

interface Calculator1 {
	public void add(double a, double b);

	public void sub(double a, double b);

	public void mul(double a, double b);

	public void div(double a, double b);
}

class DemoCalculator implements Calculator1 {
	public void add(double a, double b) {
		double result = a + b;
		printResult(result);
	}

	public void sub(double a, double b) {
		double result = a - b;
		printResult(result);
	}

	public void mul(double a, double b) {
		double result = a * b;
		printResult(result);
	}

	public void div(double a, double b) {
		double result = a / b;
		printResult(result);
	}

	public void printResult(double result) {
		System.out.println("The result is : " + result);
	}

	public static void main(String[] args) {
		Calculator1 c;
		DemoCalculator dc = new DemoCalculator();
		c = dc;
		c.add(20.0, 10.0);
		c.sub(20.0, 10.0);
		c.mul(20.0, 10.0);
		c.div(20.0, 10.0);

	}
}
