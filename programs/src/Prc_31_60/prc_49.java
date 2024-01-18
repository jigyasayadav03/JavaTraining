package Prc_31_60;

import java.util.HashMap;
import java.util.Map;

public class prc_49 {

	public static void main(String[] args) {
		String str = "Hello";

		Map<Character, Integer> Map = characterFrequency(str);

		// Display the results
		System.out.println("Character frequency in the string:");
		for (Map.Entry<Character, Integer> entry : Map.entrySet()) {
			System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " times");
		}
	}

	public static Map<Character, Integer> characterFrequency(String str) {
		Map<Character, Integer> fm = new HashMap<>();
		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (fm.containsKey(c)) {
				fm.put(c, fm.get(c) + 1);
			} else {
				fm.put(c, 1);
			}
		}

		return fm;
	}
}
