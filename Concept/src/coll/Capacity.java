package coll;

import java.util.*;

public class Capacity {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(10);
		System.out.println(list);
		list.add(2, "Vou");
	}
}
