package itmo.java.basics.lesson5;

import java.util.Scanner;

//можно решать через матчер ипаттерн

public class Task1 {
	public static void main(String[] args) {
		String s = "1. Написать метод для поиска самого длинного слова в тексте.";
		System.out.println("The longest word found by scanner: " + getLongest(s));
		System.out.println("The longest word found by String.split: " +
				getLongest(s, "[^а-яА-Я0-9_]"));

	}

	/**
	 * Search the longest word in text by using class Scanner
	 *
	 * @param text Text to find the longest word
	 * @return the longest word in text
	 */
	public static String getLongest(String text) {
		try (Scanner scanner = new Scanner(text)) {
			String longWord = scanner.next();
			while (scanner.hasNext()) {
				String temp = scanner.next();
				if (longWord.length() < temp.length()) {
					longWord = temp;
				}
			}
			return longWord;
		}
	}

	/**
	 * Search the longest word in text by using String split method
	 *
	 * @param text  Text to find the longest word
	 * @param regex A regular expression
	 * @return the longest word in text
	 */
	public static String getLongest(String text, String regex) {
		String longWord = "";
		for (String s : text.split(regex)) {
			longWord = s.length() > longWord.length() ? s : longWord;
		}
		return longWord;
	}
}
