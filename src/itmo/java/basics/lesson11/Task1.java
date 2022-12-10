package itmo.java.basics.lesson11;

public class Task1 {
	public static void main(String[] args) {
		startThread(10);
	}

	/**
	 * Thread of the Task 1.
	 * It must show stage of thread in working time while counting from 0 to 100
	 */
	public static class SomeThread implements Runnable {
		private String name;
		public static int count;

		@Override
		public String toString() {
			return "SomeThread #" + name;
		}

		public SomeThread() {
			this.name = "" + count++;
		}

		@Override
		public void run() {
			System.out.println(this + " started");
			for (int i = 0; i < 100; i++) {
				System.out.println(this + " count to " + i);
			}
			System.out.println(this + " finished");
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
			System.out.println(someThread.toString() + " before start");
			new Thread(someThread).start();
		}
	}
}
