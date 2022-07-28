//ASSIGNMANT
/*
 Q7. Write a java program to compute matrix multiplication using multithreading. Objective : Write a Java program to compute matrix multiplication using multithreading
 Description: This is an implementation of Matrix-Matrix multiplication algorithm. Number of
row equally distributed to each thread. Each thread multiplies the corresponding elements and
writes the product into the resultant matrix. The thread accesses the elements of the row based on
its rows, which is allocated by the main thread in the order of their creation.  Input : Number of row and column for first Matrix Number of row and column for second
Matrix Number of thread
 Output : Time taken in matrix multiplication*/
package MultiThread;

import java.util.Scanner;

class NewThread extends Thread {
	int lb, ub;
	int a[][] = { { 1, 2, 3, 2 }, { 4, 5, 6, 4 }, { 7, 8, 9, 3 }, { 1, 1, 1, 1 } };
	int b[][] = { { 1, 2, 3, 3 }, { 4, 5, 6, 4 }, { 1, 1, 1, 1 }, { 2, 2, 2, 2 } };
	static int c[][];

	NewThread() {

	}

	public NewThread(int n, int threadNum) {

		c = new int[4][4];
		int div = a.length / n;

		// Provide the bound for each thread...
		lb = div * threadNum;
		ub = div * threadNum + div - 1;

		System.out.println("lb=" + lb + "ub=" + ub);

	}

	public void run() {

		for (int i = lb; i <= ub; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 4; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
	}

}

public class Test {
	public static void main(String args[]) throws InterruptedException {

		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number of thread you want to consider");
		int numThread = ob.nextInt();

		// Create array of threads
		NewThread obj[] = new NewThread[numThread];
		for (int i = 0; i < numThread; i++) {
			obj[i] = new NewThread(numThread, i);
		}

		// Start array of threads....
		for (int i = 0; i < numThread; i++) {
			obj[i].start();
		}

		// Main thread wit for all other thread complete...
		try {
			for (int i = 0; i < numThread; i++) {
				obj[i].join();
			}

		} catch (Exception e) {
			System.out.println("Child interrupted.");
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(NewThread.c[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
