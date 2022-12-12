package itmo.java.basics.lesson11.Task4;

public class SecondThread implements Runnable {
	private SomeClass someClass;


	public SecondThread(SomeClass someClass) {
		this.someClass = someClass;
	}

	@Override
	public void run() {
		while (true) {
			someClass.getCount();
		}
	}

}
