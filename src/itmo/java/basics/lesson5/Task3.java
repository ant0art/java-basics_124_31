package itmo.java.basics.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {
		String s = "3. Напишите метод, заменяющий в тексте все вхождения слова «бяка» " +
				"на «[вырезано цензурой]».";
		System.out.println("Изначальная строка:\n" + s + "\n");
		System.out.println(replaceCensore(s, "бяка", "[вырезано цензурой]"));
		System.out.println(replaceText(s, "бяка", "[вырезано цензурой]"));
	}


	/**
	 * Replace censore-word with phrase "[вырезано цензурой]"
	 *
	 * @param s           Text to check censore
	 * @param regex       A regular expression
	 * @param replacement the string to be substituted for each match
	 * @return edited String
	 */
	public static String replaceCensore(String s, String regex, String replacement) {
		return s.replaceAll(regex, replacement);
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
