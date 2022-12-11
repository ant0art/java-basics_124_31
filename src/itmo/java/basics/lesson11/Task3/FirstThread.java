package itmo.java.basics.lesson11.Task3;

import java.util.concurrent.CountDownLatch;

public class FirstThread implements Runnable {
	private SomeClass someClass;
	private CountDownLatch countDownLatch;

	public FirstThread(SomeClass someClass, CountDownLatch countDownLatch) {
		this.someClass = someClass;
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			countDownLatch.await();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		while (true) {
			someClass.putCount();
		}
	}
}
