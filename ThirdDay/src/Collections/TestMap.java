package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// Creating different kinds of maps
		// Like sets in maps there is hash map, linked hash map, and tree map
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Pruthvi");
		map.put(3, "is");
		map.put(2, "learning");
		map.put(2, "JAVA");

		map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

		Set<Entry<Integer, String>> set = map.entrySet();
		System.out.println(map);
		System.out.println("printing entire map values after converting to set");
		System.out.println(set);

		System.out.println("iterating map set using for loop");
		for (Entry<Integer, String> en : set) {
			System.out.println(en.getKey() + "--" + en.getValue());
		}

	}

}
