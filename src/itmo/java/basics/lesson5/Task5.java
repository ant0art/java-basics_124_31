package itmo.java.basics.lesson5;

public class Task5 {
	public static void main(String[] args) {
		String text = "This is a test string";
		System.out.println("Sample Output:");
		System.out.println("The given string is:\n" + text);
		System.out.println(
				"The string reversed word by word is:\n" + reverseWordByWord(text));
	}

	/**
	 * Reverse the word
	 *
	 * @param s The word to reverse
	 * @return String
	 */
	public static String reverseWord(String s) {
		return new StringBuilder(s).reverse().toString();

	}

	/**
	 * Reverse the string word by word
	 *
	 * @param s The string to reverse word by word
	 * @return String
	 */
	public static String reverseWordByWord(String s) {
		String result = "";
		for (String s1 : s.split("\\b")) {
			result += reverseWord(s1);
		}
		return result;
	}
}
