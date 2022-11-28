package itmo.java.basics.lesson6.Task5;

public class Man extends User {
	/**
	 * Basic constructor for new man
	 */
	public Man() {
		super();
		getName();
	}

	/**
	 * Ask man for his name
	 */
	@Override
	public void getName() {
		System.out.print("Введите своё имя: ");
		String name = scanner.next();
		setUserName(name);
	}
}
