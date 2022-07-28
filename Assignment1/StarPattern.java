//Assignment 1
//Q10) Write a java program that will print the following patterns... 

public class StarPattern {
	public static void main(String[] args) {

		int i, j, row = 6;

		for (i = 0; i < row; i++) {

			for (j = row - i; j > 1; j--) {

				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}
}