//ASSIGNMENT-3
//Q1. Define a class Point, which can be used to create two dimensional points. Create three objects of Point class and check, these are non-collinear point . 

import java.util.*;

public class Point {
	double xCo, yCo, slopeVal;

	double slope(Point p1, Point p2) {
		slopeVal = (p2.yCo - p1.yCo) / (p2.xCo - p1.xCo);
		return slopeVal;}
	
			public static void main(String args[]) {
				Scanner in = new Scanner(System.in);
				Point p1 = new Point();
				Point p2 = new Point();
				Point p3 = new Point();
				System.out.println("Enter the co-ordinates of 1st point");
				p1.xCo = in.nextInt();
				p1.yCo = in.nextInt();
				System.out.println("Enter the co-ordinates of 2nd point");
				p2.xCo = in.nextInt();
				p2.yCo = in.nextInt();
				System.out.println("Enter the co-ordinates of 3rd point");
				p3.xCo = in.nextInt();
				p3.yCo = in.nextInt();
				double slope1, slope2, slope3;
				slope1 = p1.slope(p1, p2);
				slope2 = p1.slope(p2, p3);
				slope3 = p1.slope(p1, p3);
				if (slope1 == slope2 && slope2 == slope3)
					System.out.println("The points are collinear");
				else
					System.out.println("The points are non-collinear");
			
		}
	
}



