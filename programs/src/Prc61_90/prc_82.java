package Prc61_90;

import java.util.Scanner;

public class prc_82 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean n = isNumber(s);
		System.out.println(n);
		sc.close();
	}

	public static boolean isNumber(String s) {
		try {
			int value = Integer.parseInt(s);
			System.out.println(value);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Input String cannot be parsed to Integer.");
		}
		return false;
	}
}
