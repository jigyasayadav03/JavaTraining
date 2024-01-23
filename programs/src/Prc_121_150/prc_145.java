package Prc_121_150;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prc_145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "abhi");
		student.put(2, "jigyasa");
		student.put(3, "roshan");
		student.put(4, "harshit");
		System.out.println("enter the key to update");
		int n = sc.nextInt();
		System.out.println("enter the value you to want put");
		String s = sc.next();
		if (student.containsKey(n)) {
			student.put(n, s);
			System.out.println("after uodate " + student);
		} else {
			System.out.println("Key not found in Map.");
		}
	}
}
