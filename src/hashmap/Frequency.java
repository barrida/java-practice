package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Calculates the frequency of the array values
 * @author suleyman.yildirim
 *
 */
public class Frequency {

	private static final String String = null;

	public static void main(String[] args) {

		HashMap<String, Integer> frequencymap = new HashMap<String, Integer>();

		String[] array = { "a", "b", "c", "a", "a", "c" };

		for (String s : array) {
			if (frequencymap.containsKey(s)) {
				frequencymap.put(s, frequencymap.get(s) + 1);
			} else {
				frequencymap.put(s, 1);
			}
		}

		// print key and values
		for (Entry<String, Integer> entry : frequencymap.entrySet()) {
			System.out.println("key - value pairs: " + entry.getKey() + " : " + entry.getValue());
		}

		// print keys
		for (String keys : frequencymap.keySet()) {
			System.out.println("keys: " + keys);
		}

		// print values
		for (Integer values : frequencymap.values()) {
			System.out.println("values: " + values);
		}

		
	}

}
