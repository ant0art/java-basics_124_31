package itmo.java.basics.lesson6.Task5;

public class JavaProgram {
	public static void main(String[] args) {
		Man man = new Man();

		System.out.printf("Задано имя пользователя - %s, " + "возраст - %d",
				man.getUserName(), man.getUserAge());
	}
}
