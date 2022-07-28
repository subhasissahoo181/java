//ASSIGNMENT-2
//Q-6  Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number
package Assignment2;
import java.util.Scanner;
public class SumArray {
	public static void main(String[] args) {
		System.out.println("The elements in array are"+"[ 2, 7, 4, -5, 11, 5, 20 ]");
		Scanner input = new Scanner(System.in);
		System.out.print("Input the specified number: ");
		int num = input.nextInt();

		System.out.println("Pairs of elements and their sum :");
		

		int[] array = { 2, 7, 4, -5, 11, 5, 20 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (i == j)
					continue;
				if (array[i] + array[j] == num) {
					System.out.println(array[i] + " + " + array[j] + " = " + num);
				}
			}
		}
	}
}
