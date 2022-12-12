package itmo.java.basics.lesson11.Task4;

public class FirstThread implements Runnable {
	private SomeClass someClass;

	public FirstThread(SomeClass someClass) {
		this.someClass = someClass;
	}

	@Override
	public void run() {
		while (true) {
			someClass.putCount();
		}
	}
}
