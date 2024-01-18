package Prc_31_60;

import java.util.Scanner;

public class prc_50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String inputSentence = sc.nextLine();

		countVowelsAndConsonants(inputSentence);
	}

	public static void countVowelsAndConsonants(String sentence) {
		int vowelCount = 0;
		int consonantCount = 0;

		sentence = sentence.toLowerCase();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

			if ((ch >= 'a' && ch <= 'z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}

		System.out.println("the vouvwesls count is " + vowelCount);
		System.out.println("the consonant count is " + consonantCount);
	}

}
