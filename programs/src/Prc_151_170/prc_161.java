package Prc_151_170;

import java.util.Scanner;

public class prc_161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string 1 :");
		String str = sc.nextLine();
		System.out.println("enter the string 2 :");

		String str1 = sc.nextLine();

		boolean res = str.contains(str1);
		if (res) {
			System.out.println(str1 + " \n is subtring of string  " + str);
		} else {
			System.out.println(str1 + " \n is not the substring of string " + str);
		}

	}
}
