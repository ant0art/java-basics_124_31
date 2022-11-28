package itmo.java.basics.lesson6.Task5;

public class Man extends User {

	@Override
	public String getName() {
		System.out.print("Введите своё имя: ");
		while (!scanner.hasNextLine()) {
			if (!scanner.nextLine().isEmpty()) {
				System.out.print("Имя должно содержать хотя бы один символ: ");
			}

		}
		return scanner.next();
	}
}
