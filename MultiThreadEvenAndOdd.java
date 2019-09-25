
public class MultiThreadEvenAndOdd {
	public static void main(String[] args) {
		Printer p1 = new Printer(100);
		Thread oddThread = new Thread(() -> p1.printOdd(), "oddThread");
		Thread evenThread = new Thread(() -> p1.printEven(), "evenThread");

		evenThread.start();
		oddThread.start();
	}

}

class Printer {
	boolean isOdd = false;
	int limit;
	int conter = 1;

	public Printer(int limit) {
		this.limit = limit;
	}

	public void printOdd() {
		synchronized (this) {
			while (limit > 0) {
				if (conter % 2 != 0) {

					System.out.println("ODD: " + Thread.currentThread().getName() + conter++);
					limit--;
					notify();
				}else {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
	}

	public void printEven() {
		synchronized (this) {
			while (limit > 0) {
				if (conter % 2 == 0) {
					System.out.println("EVEN: " + Thread.currentThread().getName() + conter++);
					limit--;
					notify();
				}else {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
	}

}
