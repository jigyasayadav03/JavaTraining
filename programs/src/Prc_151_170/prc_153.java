package Prc_151_170;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class prc_153 {
	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<Integer, String>();

		student.put(1, "roshan");
		student.put(3, "abhi");
		student.put(4, "jigyasa");
		student.put(2, "harshit");
		mapSort(student);
	}

	private static void mapSort(Map<Integer, String> student) {
		Map<Integer, String> tm = new TreeMap<Integer, String>(student);
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, String> entry : tm.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

	}
}
