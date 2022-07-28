//Assignment MultiThreading
//Write a java program that will create one child thread. The child thread has to display all even numbers between m and n, and the main thread will display all odd numbers 

package MultiThreading;

import java.util.Scanner;

class ChildThread implements Runnable {
	Thread t;
	int m, n;

	ChildThread(int n1, int n2) {
		m = n1;
		n = n2;
		t = new Thread(this, "Child Thread");
		t.start();
	}

	public void run() {
		try {
			for (int i = m; i <= n; i += 2) {
				System.out.println("Child : " + i);
				Thread.sleep(500);
			}
		}
		
		catch (InterruptedException e) {
			System.out.println("Child Interrupted ");
		}
	}
}

public class Thread2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		new ChildThread(n1, n2);
		try {
			for (int i = n1 + 1; i <= n2; i += 2) {
				System.out.println("Parent : " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Parent Interrupted ");
		}
	}
}
