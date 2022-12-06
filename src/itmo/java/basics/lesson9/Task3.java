package itmo.java.basics.lesson9;

import itmo.java.basics.lesson4.Task6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		addElements(arrayList, 1000000);
		Date startDate = new Date();
		getElement(arrayList, 100000);
		Task6.getSearchTime(startDate, new Date());

		List<String> linkedList = new LinkedList<>();
		addElements(linkedList, 1000000);
		startDate = new Date();
		getElement(arrayList, 100000);
		Task6.getSearchTime(startDate, new Date());
	}

	/**
	 * Add string-elements to collection N-times
	 *
	 * @param list List to add elements
	 * @param num  Number of iterations
	 */
	public static void addElements(Collection<String> list, Integer num) {
		for (int i = 0; i < num; i++) {
			list.add("Element" + i);
		}
	}

	/**
	 * Get random number in range of List size
	 *
	 * @param list list, which size is used
	 * @param <T>  no matter which type of list elem used
	 * @return Integer
	 */
	public static <T> Integer getRandom(List<T> list) {
		Random random = new Random();
		return random.nextInt(list.size());
	}

	/**
	 * Take a random element N-times
	 *
	 * @param list list to take element
	 * @param num  Number of iterations
	 */
	public static void getElement(List<String> list, int num) {
		for (int i = 0; i < num; i++) {
			list.get(getRandom(list));
		}
	}
}
