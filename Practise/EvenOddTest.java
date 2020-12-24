package Practise;

public class EvenOddTest {
	public static void main(String[] args) {

		Printer p = new Printer(10);
		Thread oddThread = new Thread(() -> p.printOdd(), "ODDTHREAD");
		Thread evenThread = new Thread(() -> p.printEven(), "EVENTHREAD");
		oddThread.start();
		evenThread.start();

	}
}

class Printer {
	int limit;
	int counter = 1;

	public Printer(int limit) {
		this.limit = limit;
	}

	public void printEven() {
		synchronized (this) {
			while (limit > 0) {
				if (counter % 2 == 0) {
					System.out.println(Thread.currentThread().getName() + " " + counter++);
					limit--;
					notify();
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		}
	}

	public void printOdd() {
		synchronized (this) {
			while (limit > 0) {
				if (counter % 2 != 0) {
					System.out.println(Thread.currentThread().getName() + " " + counter++);
					limit--;
					notify();
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}
	}
}