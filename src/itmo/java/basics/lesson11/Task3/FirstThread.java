package itmo.java.basics.lesson11.Task3;

public class FirstThread implements Runnable {
	SomeClass someClass;

	public FirstThread(SomeClass someClass) {
		this.someClass = someClass;
	}

	@Override
	public void run() {
		while(true) {
			someClass.putCount();
		}
	}
}
