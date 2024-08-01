package Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionsHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0, "Hello");
		hm.put(1, "Good Morning");
		hm.put(2, "How are You");

		// HashMap accepts Null Values
		hm.put(3, null);

		hm.remove(1);

		System.out.println(hm);

		System.out.println(hm.get(2));

		System.out.println(hm.get(42));

		// Iterator [ HashMap has to be converted into Set to get Iterated ]

		Set<Map.Entry<Integer, String>> s = hm.entrySet();

		Iterator<Map.Entry<Integer, String>> i = s.iterator();

		while (i.hasNext()) {

			// Map.Entry to be used to separate key and value from hash set

			Map.Entry<Integer, String> m = i.next();

			System.out.println(m.getKey());
			System.out.println(m.getValue());

		}
	}
}