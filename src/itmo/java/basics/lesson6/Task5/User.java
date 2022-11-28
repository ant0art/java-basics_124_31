package itmo.java.basics.lesson6.Task5;

import java.util.Scanner;

public class User {
	private String userName;
	private int userAge;
	Scanner scanner = new Scanner(System.in);

	public void setUserName(String name) {
		this.userName = name;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserName() {
		return userName;
	}

	public int getUserAge() {
		return userAge;
	}

	/**
	 * Basic constructor for new user
	 */
	public User() {
		this.getAge();
	}

	public void getName() {
		//basic logic
	}

	/**
	 * Ask user for his age
	 */
	public void getAge() {
		System.out.print("Введите свой возраст: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("Возраст задается целым числом. Введите число: ");
		}
		this.userAge = scanner.nextInt();
	}
}
