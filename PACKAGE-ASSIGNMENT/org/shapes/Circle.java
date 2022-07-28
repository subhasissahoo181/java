//ASSIGNMANT-PACKAGE
/*Q3.Create a package named org.shapes. Create some classes in the package
representing some common geometric shapes like Square, Triangle, Circle and so on.
 The classes should contain the area( ) and perimeter( ) methods in them. Compile
the package. Use this package to find area and perimeter of different shapes as
chosen by the user*/
//class-3
package org.shapes;

public class Circle {
	private int radius;

	public Circle(int r) {
		radius = r;
	}

	public double perimeter() {
		return (4 * radius * 3.14);
	}

	public double area() {
		return (3.14 * radius * radius);
	}
}