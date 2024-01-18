package Prc61_90;

import java.util.Scanner;

public class prc_79 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the strings thst you want to compare");
		String str = sc.next();
		String str2 = sc.next();
		if (str.equals(str2)) {
			System.out.println("equal");
		} else {

			System.out.print("not equal");
		}
		if (str == str2) {
			System.out.println("equal");
		} else {

			System.out.print("not equal");
		}
	}
}
