package itmo.java.basics.lesson6.Task1_2;

public abstract class Human {
	private final String name;
	private final String surname;

	public Human(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	/**
	 * Show every attribute of definite human
	 */
	public abstract String getHuman();
}
