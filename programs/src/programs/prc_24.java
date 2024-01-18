package programs;

import java.util.Scanner;

public class prc_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int x = n;
		int rem, rev = 0;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (x == rev) {
			System.out.println("pallindrome");
		} else
			System.out.println("not a pallindrome");
	}
}
