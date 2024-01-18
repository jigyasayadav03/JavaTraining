package programs;

import java.util.Scanner;

public class prc_29 {
	static void checkPrime(int a, int b) {
		int i, j;
		System.out.println("the prime numbers are:");
		for (i = a; i <= b; i++) {
			int count = 0;
			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && i > 1) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number in which you want prime");
		int a = sc.nextInt();
		int b = sc.nextInt();
		checkPrime(a, b);
	}
}
