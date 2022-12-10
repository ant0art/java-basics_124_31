package itmo.java.basics.lesson11.Task3;

public class SomeClass {

	private int count = 0;

	public void getThreadName() {
		System.out.println(Thread.currentThread().getName());
	}

	public synchronized void getCount() {
		while (count < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		getThreadName();
		count--;
		notify();
	}

	public synchronized void putCount() {
		while (count >= 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		getThreadName();
		count++;
		notify();
	}
}
