package itmo.java.basics.lesson11.Task3;

public class SecondThread implements Runnable {
	SomeClass someClass;

	public SecondThread(SomeClass someClass) {
		this.someClass = someClass;
	}

	@Override
	public void run() {
		while(true) {
			someClass.getCount();
		}
	}

}
