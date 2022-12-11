package itmo.java.basics.lesson11.Task3;

import java.util.concurrent.CountDownLatch;

public class SecondThread implements Runnable {
	private SomeClass someClass;
	private CountDownLatch countDownLatch;


	public SecondThread(SomeClass someClass, CountDownLatch countDownLatch) {
		this.someClass = someClass;
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			countDownLatch.await();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		while (true) {
			someClass.getCount();
		}
	}

}
