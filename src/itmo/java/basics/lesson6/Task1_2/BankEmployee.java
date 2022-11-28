package itmo.java.basics.lesson6.Task1_2;

public class BankEmployee extends Human implements Greetings {
	private final String bankName;

	public BankEmployee(String name, String surname, String bankName) {
		super(name, surname);
		this.bankName = bankName;
	}

	@Override
	public String getHuman() {
		return this.getName() + " " + this.getSurname();
	}

	@Override
	public void greet() {
		System.out.printf("Добро пожаловать в наш банк %s! Если вам необходима помощь, " +
				"обращайтесь ко мне! Меня зоавут %s%n", this.bankName, this.getHuman());
	}

	@Override
	public void greet(Human human) {
		System.out.printf("Добрый день, %s! Чем я могу вам помочь?%n", human.getHuman());
	}
}
