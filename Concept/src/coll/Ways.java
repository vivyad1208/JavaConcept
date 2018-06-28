package coll;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ways {

	public static void main(String[] args) {

		// Quickly Create List
		List<String> words = Arrays.asList("JB", "Priyanka", "Vivek");
		if (words.contains("JB")) {
		    System.out.println("Yeah JB!");
		}

		// Check Disjoint
		List<String> words2 = Arrays.asList("JB", "Manjrekar", "Yadav");
		System.out.println(Collections.disjoint(words, words2));

		printCollection(words);
		printCollection(words2);
	}

	private static void printCollection(Collection<?> coll) {
		for (Object object : coll) {
			System.out.print(object+", ");
		}
		System.out.println();
	}
}