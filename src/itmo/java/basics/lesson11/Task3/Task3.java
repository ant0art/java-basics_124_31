package itmo.java.basics.lesson11.Task3;

public class Task3 {
	public static void main(String[] args) {
		SomeClass someClass = new SomeClass();
		FirstThread firstThread = new FirstThread(someClass);
		SecondThread secondThread = new SecondThread(someClass);
		Thread thread1 = new Thread(firstThread);
		Thread thread2 = new Thread(secondThread);
		thread1.start();
		thread2.start();
	}
}




