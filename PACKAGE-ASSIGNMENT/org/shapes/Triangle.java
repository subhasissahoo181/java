//ASSIGNMANT-PACKAGE
/*Q3.Create a package named org.shapes. Create some classes in the package
representing some common geometric shapes like Square, Triangle, Circle and so on.
 The classes should contain the area( ) and perimeter( ) methods in them. Compile
the package. Use this package to find area and perimeter of different shapes as
chosen by the user*/
//class-2
package org.shapes;

public class Triangle {
	private int side1, side2, side3;

	public Triangle(int a, int b, int c) {
		side1 = a;
		side2 = b;
		side3 = c;
	}

	public int perimeter() {
		return (side1 + side2 + side3);
	}

	public double area() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt((s - side1) + (s - side2) + (s - side3));
		return area;
	}
}
