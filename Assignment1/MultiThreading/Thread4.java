package MultiThreading;

import java.util.Scanner;

class Thread {
	public static int R[];

	Thread(int size) {
		R = new int[size];
	}

	public static synchronized void update(int index, int n) {
		R[index] = n;
	}
}

class Child1 extends Thread {
	int v1[], v2[], size;

	Child1(int n1[], int n2[], int s) {
		v1 = n1;
		v2 = n2;
		size = s;
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < size; i += 2) {
				Global.update(i, v1[i] * v2[i]);
			}
		} catch (Exception e) {
			System.out.println("Child1 Exception " + e);
		}
	}
}

class Child2 extends Thread {
	int v1[], v2[], size;

	Child2(int n1[], int n2[], int s) {
		v1 = n1;
		v2 = n2;
		size = s;
		start();
	}

	public void run() {
		try {
			for (int i = 1; i < size; i += 2) {
				Global.update(i, v1[i] * v2[i]);
			}
		} catch (Exception e) {
			System.out.println("Child1 Exception " + e);
		}
	}
}

public class Thread4 {
	public static void main(String args[]) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the size of Array : "); // for array length
		int l = sc.nextInt();
		int v1[] = new int[l];
		int v2[] = new int[l];
		System.out.print("\n Enter the Elements of vector 1: "); // entering elements of vector1
		for (i = 0; i < l; i++) {
			v1[i] = sc.nextInt();
		}
		System.out.print("\n Enter the Elements of vector 2 : "); // entering elements of vector2
		for (i = 0; i < l; i++) {
			v2[i] = sc.nextInt();
		}
		Global g = new Global(l);
		Child1 c1 = new Child1(v1, v2, l);
		Child2 c2 = new Child2(v1, v2, l);
		try {
			c1.join();
			c2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.print("\n Product of 2 vectors : ");
		for (i = 0; i < l; i++) {
			System.out.print(Global.R[i] + " ");
		}
	}
}
