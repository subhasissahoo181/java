//ASSIGNMENT
/*Q8. The producer-consumer problem is one of the most frequently encountered problems when we
attempt multithreaded programming.  Producers produce items.  Consumers consume the items produced
 by the producers.  Producers finish production and let the consumers know that they are done. Note that 
 in this producer-consumer problem the producer is running on a different thread than the ones
on consumer. This setup makes sense in two cases. The steps to do the consumption of the item 
produced in independent and not dependent on other items.*/
package MultiThread;

public class Procon {
	public static void main(String[] args) {
		Q q = new Q();

		new Producer(q);
		new Consumer(q);

	}
}

class Q {
	int num;
	boolean valueSet = false;

	public synchronized void set(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		System.out.println("Put: " + num);
		this.num = num;
		valueSet = true;
		notify();

	}

	public synchronized void get() {
		while (!valueSet) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		System.out.println("Get: " + num);
		valueSet = false;
		notify();

	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.set(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}
}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}
