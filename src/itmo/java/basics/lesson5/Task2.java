package itmo.java.basics.lesson5;

import itmo.java.basics.lesson4.Task6;
import java.util.Arrays;
import java.util.Date;

public class Task2 {
	public static void main(String[] args) {
		String text = "ТОПОТ";
		Date dateStart = new Date();
		System.out.println(isPalindrom(text));
		Task6.getSearchTime(dateStart, new Date());
		dateStart = new Date();
		System.out.println(isPalindrom2(text));
		Task6.getSearchTime(dateStart, new Date());
	}

	/**
	 * Check the word if it can be read equal both sides (vice versa).
	 * Method uses char array
	 *
	 * @param s String-word to check
	 * @return true if word is equal vice versa
	 */
	public static boolean isPalindrom(String s) {
		char[] charArray = s.toCharArray();
		char[] temp = new char[charArray.length];
		String tempString = "";
		for (int i = 0; i < charArray.length; i++) {
			temp[i] = charArray[charArray.length - i - 1];
		}
		return Arrays.equals(charArray, temp);
	}

	/**
	 * Check the word if it can be read equal both sides (vice versa).
	 * Method uses StringBuilder
	 *
	 * @param s String-word to check
	 * @return true if word is equal vice versa
	 */
	public static boolean isPalindrom2(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		return stringBuilder.toString().equals(s);
	}
}
