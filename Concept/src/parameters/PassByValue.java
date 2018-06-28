package parameters;

import java.util.*;

public class PassByValue {

	@SuppressWarnings({ "rawtypes", "serial", "unchecked", "unlikely-arg-type" })
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap(){{ put(1, "2"); }};
		System.out.println(map.get(1));
	}

	@SuppressWarnings("unused")
	static private void changeMap(Map<?,?> map) {
		map = new HashMap<>();
	}
}
