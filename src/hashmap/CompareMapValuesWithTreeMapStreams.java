package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Predicate;

public class CompareMapValuesWithTreeMapStreams {

	public static void main(String[] args) {

		TreeMap<String, HashSet<String>> treeMap = new TreeMap<String, HashSet<String>>();
		treeMap.put("meal1", new HashSet<>(Arrays.asList("Lemon", "Orange", "Berry", "Lemon")));
		treeMap.put("meal2", new HashSet<>(Arrays.asList("Chicken", "Rice", "Spinach")));
		treeMap.put("meal3", new HashSet<>(Arrays.asList("Lentils", "Pea", "Beef")));
		treeMap.put("meal4", new HashSet<>(Arrays.asList("Chicken", "Rice", "Spinach")));
		treeMap.put("meal5", new HashSet<>(Arrays.asList("Beef", "Lentils", "Pea")));
		System.out.println("Map initialized: " + treeMap.toString() + "\n");

		Predicate<? super Entry<String, HashSet<String>>> isPrevAndNextEqual = (e) -> {
			Map.Entry<String, HashSet<String>> prev = treeMap.lowerEntry(e.getKey()); // previous
			Map.Entry<String, HashSet<String>> next = treeMap.higherEntry(e.getKey()); // next
			return Optional.ofNullable(prev).isPresent() && Optional.ofNullable(next).isPresent()
					&& prev.getValue().equals(next.getValue());
		};
		
		treeMap.entrySet().stream().filter(isPrevAndNextEqual).forEach(System.out::println);
		System.out.println("The number of meals that match: " + treeMap.entrySet().stream().filter(isPrevAndNextEqual).count());

	}

}
