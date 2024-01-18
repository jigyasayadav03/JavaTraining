package Prc_31_60;

import java.util.Scanner;

public class prc_35 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("entr the number:");
		int n = sc.nextInt();
		int fact = factorial(n);
		System.out.println(fact);
	}

	private static int factorial(int n) {
		if (n == 1) {
			return 1;

		}

		return n * factorial(n - 1);
	}
}
