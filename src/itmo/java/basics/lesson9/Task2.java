package itmo.java.basics.lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task2 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("sfg");
		strings.add("sfg2");
		strings.add("s3fg");
		strings.add("sf4g");
		strings.add("sfg");
		strings.add("sfg2");
		strings.add("s3fg");
		System.out.println(strings);
		System.out.println(getCollectionOfUniq(strings));
	}

	public static <T> Collection<T> getCollectionOfUniq(List<T> list) {
		return new HashSet<>(list);
	}
}
