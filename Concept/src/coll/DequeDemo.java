package coll;

import java.util.*;

public class DequeDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Priyanka","JB","Vivek");
		Deque<String> deque = new ArrayDeque<>(list);
		System.out.println(deque);
	}
}
