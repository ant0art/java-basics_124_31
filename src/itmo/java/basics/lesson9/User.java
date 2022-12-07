package itmo.java.basics.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class User {
	private String name;
	static Map<User, Integer> standings = new HashMap<>();

	public User(String name) {
		this.name = name;
		standings.put(this, 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Show a score-points of definite user
	 *
	 * @param userName name of user
	 */
	public static void getScore(String userName) {
		Integer score = -1;
		for (Map.Entry<User, Integer> pair : standings.entrySet()) {
			if (pair.getKey().getName().equals(userName)) {
				score = pair.getValue();
				System.out.println("У пользователя " + score + " очков");
			}
		}
		if (score == -1) {
			System.out.println("Пользователь не найден");
		}
	}

	/**
	 * Get a random value in range
	 *
	 * @param num size of range
	 * @return Integer
	 */
	public Integer getRandomScore(Integer num) {
		return new Random().nextInt(num);
	}

	/**
	 * Show boarding score of all users
	 */
	public static void showStandings() {
		for (Map.Entry<User, Integer> entry : standings.entrySet()) {
			System.out.println(entry.getKey().getName() + " " + entry.getValue());
		}
	}
}
