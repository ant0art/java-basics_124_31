package itmo.java.basics.lesson6.Task1_2;

public class Client extends Human implements Greetings {
	private String bankName;

	public Client(String name, String surname, String bankName) {
		super(name, surname);
		this.bankName = bankName;
	}

	@Override
	public String getHuman() {
		return this.getName() + " " + this.getSurname();
	}

	@Override
	public void greet() {
		System.out.printf("Здравствуйте! Меня зовут %s! К кому я могу обратиться?%n",
				this.getHuman());
	}

	@Override
	public void greet(Human human) {
		System.out.printf("%s, добрый день!%n", human.getHuman());
	}
}
