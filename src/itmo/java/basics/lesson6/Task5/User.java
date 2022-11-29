package itmo.java.basics.lesson6.Task5;

import java.util.Scanner;

public class User {
	Scanner scanner = new Scanner(System.in);

	public void getInfo() {
		System.out.println(getAge());
	}

	public int getAge() {
		System.out.print("Введите свой возраст: ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("Возраст задается целым числом. Введите число: ");
		}
		return scanner.nextInt();
	}

	public String getName() {
		return "";
	}
}
