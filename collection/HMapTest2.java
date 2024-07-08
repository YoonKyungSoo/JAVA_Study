package collection;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HMapTest2 {
	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<>();

		dict.put("fly", "날다");
		dict.put("walk", "걷다");
		dict.put("run", "뛰다");
//
//		System.out.println("fly");
//		System.out.println("walk");
//		System.out.println("run");

		String[] keys = { "fly", "walk", "run" };

//		hashMap의 쌍의 개수 
		for (int i = 0; i < dict.size(); i++) {
			System.out.println(dict.get(keys[i]));
		}

		Set<String> keyset = dict.keySet();
		Iterator<String> keyiter = keyset.iterator();
		while (keyiter.hasNext()) {
		}
		String key = keyiter.next();
		System.out.println(key);
		System.out.println("========================");

		Collection<String> values = dict.values();
		Iterator<String> valueiter = values.iterator();
		while (valueiter.hasNext()) {
			String value = valueiter.next();
			System.out.println(value);

			System.out.println("========================");

			Set<Entry> entryset = dict.entrySet();
			Iterator<Entry> entryiter = entryset.iterator();
			
			while (entryiter.hasNext() {
				Entry entry = entryiter.next();
				
				System.out.println(entry.getkey);
				System.out.println(entry.getValue);
			}

			System.out.println("========================");
		}
	}

}
