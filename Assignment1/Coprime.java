
//Assignment 1
//Q11)Write a program that find all the numbers that are coprime to a given number N and less than N. (Note: A pair(a, b) is said to be co-prime if gcd(a, b) = 1 )

public class Coprime {
	static int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return 0;
		
		if (a == b)
			return a;

		if (a > b)
			return gcd(a - b, b);

		return gcd(a, b - a);
	}

	static boolean coprime(int a, int b) {
		return (gcd(a, b) == 1);
	}

	
	static int numOfPairs(int arr[], int n) {

		int count = 0;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (coprime(arr[i], arr[j]))
					count++;

		return count;
	}

	public static void main(String args[])  {
		int arr[] = { 1, 2, 5, 4, 8, 3, 9 };
		int n = arr.length;

		System.out.println("coprime number is"+numOfPairs(arr, n));
	}

}
