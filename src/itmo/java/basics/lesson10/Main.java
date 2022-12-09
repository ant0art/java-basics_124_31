package itmo.java.basics.lesson10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Main {
	public static void main(String[] args) {
		//TASK EXAMPLES
		String file1 = "data/input.txt";
		String file2 = "data/output.txt";
		String file3 = "data/result.txt";

		//TASK 1
		String task = readFile(file1).get(1);
		//TASK 2
		writeToFile(file2, task, true);
		//TASK 3
		mergeFiles(file1, file2, file3);
		//TASK 4
		replaceChar(file3, "[^а-яА-Я0-9_]", '$');
	}

	/**
	 * Get list of strings read from .txt file
	 *
	 * @param path A path to .txt file
	 * @return List <String>
	 */
	public static List<String> readFile(String path) {
		List<String> strings = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			while (reader.ready()) {
				strings.add(reader.readLine() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return strings;
	}

	/**
	 * Write a string to chosen .txt file
	 *
	 * @param path   A path to .txt file
	 * @param string String to write
	 * @param append true - if you need to add string to the end of file, false - if
	 *               you want to rewrite file by string
	 */
	public static void writeToFile(String path, String string, boolean append) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, append))) {
			writer.write(string);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Merge two .txt files in third
	 *
	 * @param file1  A path to first .txt file
	 * @param file2  A path to second .txt file
	 * @param result A path to third .txt file
	 */
	public static void mergeFiles(String file1, String file2, String result) {
		writeToFile(result, "", false);
		for (String s : readFile(file1)) {
			writeToFile(result, s, true);
		}
		for (String s : readFile(file2)) {
			writeToFile(result, s, true);
		}
	}

	/**
	 * Replace text in .txt file by chosen symbol
	 *
	 * @param file   A path to .txt file
	 * @param regex  A regular expression
	 * @param symbol A symbol to replace
	 */
	public static void replaceChar(String file, String regex, char symbol) {
		List<String> strings = readFile(file);
		writeToFile(file, "", false);
		for (String string : strings) {
			string = string.replaceAll(regex,
					Matcher.quoteReplacement(Character.toString(symbol)));
			writeToFile(file, string, true);
		}
	}

}
