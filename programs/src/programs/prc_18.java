package programs;

import java.util.Scanner;

public class prc_18 {
	public static void main(String[] args) {
		int gcd = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println("the greatest common divisor of the two number is:" + gcd);
	}
}
