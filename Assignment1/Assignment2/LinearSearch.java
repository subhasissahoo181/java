//Assignment2
//q-1 Write a java program that will search (Linear Search) a number from an array of 10 numbers.
package Assignment2;

public class LinearSearch {
	public static int search(int arr[], int x)

	{
		int a = arr.length;
		for (int i = 0; i <= a; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;

		int result = search(arr, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + result);
	}
}