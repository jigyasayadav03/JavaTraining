package Prc_121_150;

import java.util.HashMap;
import java.util.Map;

public class prc_142 {
	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "abhi");
		student.put(2, "jigyasa");
		student.put(3, "roshan");
		student.put(4, "harshit");
		for (Map.Entry<Integer, String> e : student.entrySet())
			System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
	}
}
