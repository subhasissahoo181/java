//ASSIGNMENT
/*Q3. Write a java program that will create two threads. Set the priority to each */
package MultiThread;

public class Priority {
	public static void main(String[] args) {

		Runnable t1 = new Runnable() {
			public void run() {
				for (int i = 0; i <= 2; i++) {
					System.out.println("hi" + Thread.currentThread().getPriority());
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}

				}
			}
		};
		Runnable t2 = new Runnable() {
			public void run() {
				for (int i = 0; i <= 2; i++) {
					System.out.println("Hello" + Thread.currentThread().getPriority());
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		};

		Thread g1 = new Thread(t1);
		Thread g2 = new Thread(t2);

		g1.start();
		g2.start();

		g1.setPriority(1);
		g2.setPriority(10);

		try {
			g1.join();
		} catch (Exception e) {
		}
		;
		try {
			g2.join();
		} catch (Exception e) {
		}
		;

		System.out.println("BYE");

	}
}
