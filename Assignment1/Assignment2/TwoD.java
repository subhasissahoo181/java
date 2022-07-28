//ASSIGNMENT-2
//Q-10 Write a java program that will read, Initialize and print all elements of a 2D array.
package Assignment2;

import java.util.*;

public class TwoD {
	public static void print2D(int str[][]) {
		// private static String[] args;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j] + " ");
			}
		}

	}

	public static void main(String args[]) {
		TwoD.args = args;
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
	}
}
