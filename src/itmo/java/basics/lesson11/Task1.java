package itmo.java.basics.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
	public static void main(String[] args) {
		List<Thread> threadList = makeThreads(10);

		for (Thread thread : threadList) {
			thread.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (Thread thread : threadList) {
			System.out.println(thread.getName() + " " + thread.getState());

		}
	}

	/**
	 * Thread of the Task 1.
	 * It must show stage of thread in working time while counting from 0 to 100
	 */
	public static class SomeThread implements Runnable {
		public static int count;

		public SomeThread() {
		}

		@Override
		public void run() {
			Thread thread = Thread.currentThread();
			for (int i = 0; i < 10; i++) {
				System.out.println(thread.getName() + " count to " + i);
			}
			System.out.println(
					thread.getName() + " " + thread.isAlive() + " " + thread.getState());
		}
	}

	/**
	 * Get list of N-number threads of {@link itmo.java.basics.lesson11.Task1.SomeThread}
	 *
	 * @param count quantity of started threads
	 * @return List of Threads
	 * @see itmo.java.basics.lesson11.Task1.SomeThread
	 * <code>class
	 * SomeThread</code>
	 */
	public static List<Thread> makeThreads(Integer count) {
		List<Thread> threadList = new ArrayList<>();
		for (int i = 1; i <= count; i++) {
			SomeThread someThread = new SomeThread();
			Thread thread = new Thread(someThread);
			threadList.add(thread);
			System.out.println(thread.getName() + " " + thread.getState());
		}
		return threadList;
	}
}
