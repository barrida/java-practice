package hashmap.wordclouddata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCloudData {

	private Map<String, Integer> wordsToCounts = new HashMap<>();

	public void addWordToHashMap(String word) {
		if (wordsToCounts.containsKey(word)) {
			wordsToCounts.put(word, wordsToCounts.get(word) + 1);
		} else {
			wordsToCounts.put(word, 1);
		}
	}

	public List<String> splitWords(String inputSting) {

		List<String> words = new ArrayList<>();
		int currentWordLength = 0;
		int currentWordStartIndex = 0;

		for (int i = 0; i < inputSting.length(); i++) {
			char ch = inputSting.charAt(i);
			if (Character.isLetter(ch)) {
				if (currentWordLength == 0) {
					currentWordStartIndex = i;
				}
				currentWordLength++;
			} else {
				String currentWord = inputSting.substring(currentWordStartIndex,
						currentWordStartIndex + currentWordLength);
				words.add(currentWord);
				currentWordLength = 0;
			}
		}

		return null;

	}

	public static void main(String[] args) {

	}

}
