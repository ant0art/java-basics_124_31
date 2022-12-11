package itmo.java.basics.lesson11.Task3;

import java.util.concurrent.CountDownLatch;

public class Task3 {

	static CountDownLatch countDownLatch = new CountDownLatch(1);

	public static void main(String[] args) {
		SomeClass someClass = new SomeClass();
		FirstThread firstThread = new FirstThread(someClass, countDownLatch);
		SecondThread secondThread = new SecondThread(someClass, countDownLatch);
		Thread thread1 = new Thread(firstThread);
		Thread thread2 = new Thread(secondThread);
		startThreads();
		thread1.start();
		thread2.start();
	}

	public static void startThreads() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " started");
		countDownLatch.countDown();
		System.out.println(
				"Счётчик действий до запуска потоков = " + countDownLatch.getCount());
	}
}




