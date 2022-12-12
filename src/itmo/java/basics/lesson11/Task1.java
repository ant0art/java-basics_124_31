package itmo.java.basics.lesson11;

public class Task1 {
	public static void main(String[] args) {
		startThreads(10);
	}

	public static class SomeThread implements Runnable {

		@Override
		public void run() {
			startCount(0, 100);
		}

		public void startCount(int start, int end) {
			Thread thread = Thread.currentThread();
			for (int i = start; i < end; i++) {
				System.out.println(thread.getName() + " count to " + i);
			}
		}
	}

	public static void startThreads(int num) {
		SomeThread someThread = new SomeThread();
		for (int i = 0; i < num; i++) {
			new Thread(someThread).start();
		}
	}


}
