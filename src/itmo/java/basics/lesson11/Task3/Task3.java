package itmo.java.basics.lesson11.Task3;

public class Task3 {


	public static void main(String[] args) {
		startThread(100);
	}

	/**
	 * Thread of the Task 3.
	 * Every start of 100 threads must show counter as 100000
	 */
	public static class SomeThread implements Runnable {
		static Counter counter = new Counter();
		private String name;
		public static int count;


		public SomeThread() {
			this.name = "" + count++;
		}

		@Override
		public String toString() {
			return "SomeThread #" + name;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 1000; i++) {
				synchronized (counter) {
					counter.increment();
				}
				System.out.println(this + " increase counter to " + counter.getCount());
			}
		}
	}

	/**
	 * Start N-number threads
	 *
	 * @param count quantity of started threads
	 */
	public static void startThread(Integer count) {
		for (int i = 1; i <= count; i++) {
			SomeThread someThread = new SomeThread();
			new Thread(someThread).start();
		}
	}
}
