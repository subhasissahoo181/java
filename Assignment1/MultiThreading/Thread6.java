package MultiThreading;

public class Thread6 {

}

import java.util.Scanner;

class Global {
	public static int min, tno = 0;

	public static synchronized void minimum(int n, int t) {
		tno = t;
		if (tno == 0) {
			min = n;
		} else {
			if (min > n)
				min = n;
		}
	}
}

class ChildThread extends Thread {
	int x, y, arr[], t;

	ChildThread(int n1, int n2, int a[], int x) {
		x = n1;
		y = n2;
		arr = a;
		t = x;
		start();
	}

	public void run() {
		try {
			int m = arr[x];
			for (int i = x; i < y; i++) {
				if (m > arr[i])
					m = arr[i];
			}
			Global.minimum(m, t);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class ThreadMin {
	public static void main(String args[]) {
		int t, l, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the length of Array : "); // for array length
		l = sc.nextInt();
		int a[] = new int[l];
		System.out.print("\n Enter the Elements of Array :"); // entering elements of array
		for (i = 0; i < l; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("\n Enter the Number of Thread : ");
		t = sc.nextInt();
		System.out.print("\n Elements of Array : "); // displaying elements of array
		for (i = 0; i < l; i++) {
			System.out.print(a[i] + " , ");
		}
		ChildThread c[] = new ChildThread[t];// creating array of Threads
		for (i = 0; i < t - 1; i++) {
			c[i] = new ChildThread((l / t) * i, (l / t) * (i + 1) - 1, a, i);
		}
		c[i] = new ChildThread((l / t) * i, l - 1, a, i); // This is for last thread
		try {
			for (i = 0; i < t; i++) {
				c[i].join();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.print("\n Minimum no of array elements = " + Global.min + "\n");
	}
}