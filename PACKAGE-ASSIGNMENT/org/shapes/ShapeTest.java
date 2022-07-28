//ASSIGNMANT-PACKAGE
/*Q3.Create a package named org.shapes. Create some classes in the package
representing some common geometric shapes like Square, Triangle, Circle and so on.
 The classes should contain the area( ) and perimeter( ) methods in them. Compile
the package. Use this package to find area and perimeter of different shapes as
chosen by the user*/
//class-4
package org.shapes;

import org.shapes.*;
import java.util.Scanner;

public class ShapeTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter side of Square : ");
		int s = sc.nextInt();
		Square sq = new Square(s);
		System.out.println("\n Perimeter of Square = " + sq.perimeter());
		System.out.println("\n Area of Square = " + sq.area());
		System.out.print("\n\n Enter 3 sides of Triangle : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Triangle t = new Triangle(a, b, c);
		System.out.println("\n Perimeter of Triangle = " + t.perimeter());
		System.out.println("\n Area of Triangle = " + t.area());
		System.out.print("\n\n Enter radius of Circle : ");
		int r = sc.nextInt();
		Circle ci = new Circle(r);
		System.out.println("\n Perimeter of Circle = " + ci.perimeter());
		System.out.println("\n Area of Circle = " + ci.area());
	}
}
