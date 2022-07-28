//ASSIGNMENT
/*
  Q6. java thread program to search the minimum number in a given array
Objective : Write a Java thread program to search the Minimum number in a given array.  Description
This program find minimum element in a given set of element. This introduces the concept of a
Synchronized block. Each thread find minimum element in a block of element and compare to
global minimum element. When all the threads are done, the global variable will contain the
minimum element. It uses a Synchronized block to make sure that only one thread is updating the global
minimum variable at any given time
 Input : Number of elements, Number of Thread.  Output: Minimum Elemen*/
package MultiThread;

public class Mth {

	public static void main(String[] args) throws Exception {
		Compare1 o1 = new Compare1();
		Compare2 o2 = new Compare2();

		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(o2);

		t1.start();
		t1.join();

		t2.start();
		t2.join();

		System.out.println(Elements.Minimum);

	}

}

class Elements {

	static int Minimum;
	static int Arr[] = { 2, 5, 4, 8, 1, 9, 10 };

	public void update(int min) {
		Elements.Minimum = min;

	}

}

class Compare1 extends Elements implements Runnable {
	int arr[] = Elements.Arr;

	public void run() {
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {

				if (arr[i] > arr[j]) {
					int temp = this.arr[i];
					this.arr[i] = this.arr[j];
					this.arr[j] = temp;

				}

			}

		}
		int min = arr[0];
		update(min);
	}
}

class Compare2 extends Elements implements Runnable {
	int arr[] = Elements.Arr;

	static int temp;

	public void run() {
		for (int i = 3; i < 7; i++) {
			for (int j = i + 1; j < 7; j++) {

				if (arr[i] > arr[j]) {
					temp = this.arr[i];
					this.arr[i] = this.arr[j];
					this.arr[j] = temp;

				}

			}

		}
		int min = arr[3];

		if (Elements.Minimum > min) {
			update(min);
		}

	}
}