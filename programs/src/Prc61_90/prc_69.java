package Prc61_90;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class prc_69 {
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("C", 3);
		hm.put("D", 4);

		List<Map.Entry<String, Integer>> l = new ArrayList<>(hm.entrySet());
		System.out.println("HashMap converted to List:");
		for (Map.Entry<String, Integer> entry : l) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
