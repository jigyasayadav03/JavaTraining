package programs;

import java.util.Scanner;

public class prc_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("the enetered character is vowels ");
		} else {
			System.out.println("it is consonants");
		}
	}
}