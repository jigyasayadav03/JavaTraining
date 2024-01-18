package programs;

import java.util.Scanner;

public class prc_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any character you wantb to check");
		char c = sc.next().charAt(0);
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is alphabet");
		else
			System.out.println(c + " not alphabet");
	}
}
