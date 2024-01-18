package Prc_31_60;

import java.util.Scanner;

public class prc_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence here : ");
		String str = sc.nextLine();
		System.out.println("The sentence before reverse is :" + str);
		String rev = reverseString(str);

		System.out.println("The sentence after reversal is :  " + rev);
		sc.close();
	}

	private static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		}

		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
