package itmo.java.basics.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
	public static void main(String[] args) {
		String s1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
				"eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
				"In egestas erat imperdiet sed. Vitae tempus quam pellentesque " +
				"nec nam aliquam. Dolor purus non enim praesent. Aliquet enim " +
				"tortor at auctor urna. Laoreet non curabitur gravida arcu ac. " +
				"Arcu dui vivamus arcu felis bibendum ut. Molestie a iaculis at " +
				"erat pellentesque. Turpis massa sed elementum tempus egestas " +
				"sed sed risus. Bibendum est ultricies integer quis. Mi tempus " +
				"imperdiet nulla malesuada pellentesque elit eget gravida. " +
				"Massa ultricies mi quis hendrerit dolor magna eget est lorem. " +
				"Vulputate odio ut enim blandit volutpat.";
		String s2 = "\\but\\b";
		String s3 = "ultricies mi";
		System.out.println("Количество найденных совпадений: " + countMatches(s1, s2));
		System.out.println("Количество найденных совпадений: " + countMatches(s1, s3));
	}


	/**
	 * Count the number of matches in the input text
	 *
	 * @param s     input text
	 * @param regex A regular expression
	 * @return int
	 */
	public static int countMatches(String s, String regex) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(s);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		return count;
	}
}
