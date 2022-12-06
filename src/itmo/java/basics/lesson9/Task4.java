package itmo.java.basics.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
	public static void main(String[] args) {
		makeStandings(100);
		User.getScore(getUserName());
	}

	/**
	 * Make N-users for boarding score
	 *
	 * @param num number if users
	 */
	public static void makeStandings(Integer num) {
		for (int i = 1; i <= num; i++) {
			User user = new User("User" + i);
			User.standings.put(user, user.getRandomScore(1000));
		}
	}

	/**
	 * Ask to write a name of User
	 *
	 * @return String name
	 */
	public static String getUserName() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		try {
			System.out.print("Введите имя пользователя в формате \"UserN\", где N - " +
					"порядковый номер игрока (имя): ");
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}


