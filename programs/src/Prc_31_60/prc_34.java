package Prc_31_60;

import java.util.Scanner;

public class prc_34 {
	public static int sumNaturalNumbers(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + sumNaturalNumbers(n - 1);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("entr the number:");
		int n = sc.nextInt();
		int sum = sumNaturalNumbers(n);
		System.out.println(sum);
	}
}
