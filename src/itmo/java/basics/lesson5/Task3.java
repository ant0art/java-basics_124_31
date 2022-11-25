package itmo.java.basics.lesson5;

import itmo.java.basics.lesson4.Task6;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {
		String s = "3. Напишите метод, заменяющий в тексте все вхождения слова «бяка» " +
				"на «[вырезано цензурой]».";
		System.out.println("Изначальная строка:\n" + s + "\n");
		Date startDate = new Date();
		System.out.println(replaceCensore(s, "бяка"));
		Task6.getSearchTime(startDate, new Date());
		startDate = new Date();
		System.out.println(replaceText(s, "бяка", "[вырезано цензурой]"));
		Task6.getSearchTime(startDate, new Date());
	}


	/**
	 * Replace censore-word with phrase "[вырезано цензурой]"
	 *
	 * @param s     Text to check censore
	 * @param regex A regular expression
	 * @return edited String
	 */
	public static String replaceCensore(String s, String regex) {
		return s.replaceAll(regex, "[вырезано цензурой]");
	}

	/**
	 * Replace censore-word with chosen phrase
	 *
	 * @param s           Text to check censore
	 * @param regex       A regular expression
	 * @param replacement the string to be substituted for each match
	 * @return edited String
	 */
	public static String replaceText(String s, String regex, String replacement) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		StringBuilder sb = new StringBuilder();
		while (matcher.find()) {
			matcher.appendReplacement(sb, replacement);
		}
		matcher.appendTail(sb);
		return sb.toString();
	}
}
