package Prc_121_150;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prc_147 {
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("Abhi", "laptop");
		hm.put("Jigyasa", "mouse");
		hm.put("Roshan", "keyboard");
		hm.put("Harshit", "earphone");
		hm.put("Abhishek", "internet");

		System.out.println(hm);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value whose key you want to see");
		String s = sc.next();
		for (Map.Entry<String, String> e : hm.entrySet()) {
			if (s.equals(e.getValue())) {
				System.out.println("Key: " + e.getKey());

				break;
			} else {
				System.out.println("no such value found");
				break;
			}
		}
	}
}
