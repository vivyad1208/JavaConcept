package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("", null);
		map.put("", "2");

		Set<Entry<String, Object>> entrySet = map.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			System.out.println(entry);
			/*if(entry.getValue())*/
		}
	}

}
