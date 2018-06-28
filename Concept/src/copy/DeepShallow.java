package copy;

import java.util.HashMap;

public class DeepShallow {

	public static void main(String[] args) {
		HashMap<String, String>map = new HashMap<>();
		map.put("h", "H");
		HashMap<String,String> mapShallow = map;
		mapShallow.put("i", "I");
		HashMap<String,String> mapDeep = new HashMap<>(map);
		mapShallow.put("j", "J");
		mapDeep.put("k", "K");

		System.out.println(map);
		System.out.println(mapShallow);
		System.out.println(mapDeep);

		square(2);
	}

	static public <U extends Number> void square( U u ) {
		System.out.println(u.doubleValue()*u.doubleValue());
	}

	
}
