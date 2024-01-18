package Prc_121_150;

import java.util.Scanner;

public class prc_125 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		System.out.println("Before capitalizing: " + str);

		for (int i = 0; i < ch.length-1; i++) {

			ch[0] = Character.toUpperCase(ch[0]);

			if (ch[i] == ' ') {

				ch[i + 1] = Character.toUpperCase(ch[i + 1]);
			}
		}
		str = String.valueOf(ch);
		System.out.println("After first letter capital: " + str);
	}
}