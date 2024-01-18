package Prc_121_150;

import java.util.Arrays;

public class prc_121 {
	public static void main(String[] args) {
		String s1 = "jigyasa";
		String s2 = "yasajig";
		int count = 0;

		char c1[] = s1.toCharArray();
		Arrays.sort(c1);
		char c2[] = s2.toCharArray();
		Arrays.sort(c2);
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] == c2[i]) {
				count++;
			}
		}
		if (count == c1.length) {
			System.out.println(" it is a anagram ");
		} else {
			System.out.println("it is not a anagram");
		}
	}
}
