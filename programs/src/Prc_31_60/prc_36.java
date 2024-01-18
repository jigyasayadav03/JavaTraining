package Prc_31_60;

import java.util.Scanner;

public class prc_36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number whose gcd you want to see ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = greatestCommonDivisior(a, b);
		System.out.println(gcd);
	}

	private static int greatestCommonDivisior(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		return greatestCommonDivisior(b, a % b);
	}

}
