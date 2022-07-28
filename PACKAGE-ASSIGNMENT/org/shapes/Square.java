//ASSIGNMANT-PACKAGE
/*Q3.Create a package named org.shapes. Create some classes in the package
representing some common geometric shapes like Square, Triangle, Circle and so on.
 The classes should contain the area( ) and perimeter( ) methods in them. Compile
the package. Use this package to find area and perimeter of different shapes as
chosen by the user*/

//class-1
package org.shapes;

public class Square {
	private int side;

	public Square(int s) {
		side = s;
	}

	public int perimeter() {
		return (4 * side);
	}

	public int area() {
		return (side * side);
	}
}