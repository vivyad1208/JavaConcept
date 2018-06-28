package map;

import java.util.Hashtable;

public class HashTableImpl {

	public static void main(String[] args) {
		Hashtable<Object, Object> hashTable = new Hashtable<>();
		hashTable.put(new Object(), "Blank Object");
		hashTable.put(new Object(), "Blank Object");
		hashTable.put(new Object(), "Blank Object");
		System.out.println(hashTable);
	}
}
