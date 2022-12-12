package itmo.java.basics.lesson11;

public class Task2 {
	public static void main(String[] args) {
		Thread thread = new Thread(new SomeThread());
		//Поток перед запуском
		System.out.println(thread.getName() + " " + thread.getState());
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		//Поток после завершения
		System.out.println(thread.getName() + " " + thread.getState());

	}

	public static class SomeThread implements Runnable {
		@Override
		public void run() {
			//Поток во время выполнения
			System.out.println(Thread.currentThread().getName() + " " +
					Thread.currentThread().getState());
		}
	}
}
