//ASSIGNMANT
/*Q5. Simple Java thread program to compute the sum of N natural numbers
Objective: Write a Java program to compute the sum of N natural number  Description
This program prints the sum of first N natural numbers. This introduces the concept of a
Synchronized block. Each thread adds its assigned number to a global variable. When all the
threads are done, the global variable will contain the result. It uses a Synchronized block to make
sure that only one thread is updating the variable at any given time
 Input : Number of Thread
 Output: Sum of first N natural numbers, N is the number of threads specified*/
package MultiThread;

class Counter {
	static int count;

	public synchronized void increment(int index) {
		count = count + index;
	}

	public int show() {
		return count;
	}
}

class Sum1 extends Counter implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			increment(i);
		}
	}
}

class Sum2 extends Counter implements Runnable {

	public void run() {
		for (int i = 6; i <= 10; i++) {
			increment(i);
		}
	}

}

public class Myth51 {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();

		Sum1 s1 = new Sum1();
		Sum2 s2 = new Sum2();

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);

		t1.start();
		t1.join();

		t2.start();
		t2.join();

		System.out.println("Count " + c.show());
	}
}
