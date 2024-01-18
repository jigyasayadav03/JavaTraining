package Prc_31_60;

import java.util.Scanner;

public class prc_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean c = false;
		System.out.println(n);
		for (int i = 2; i <= n / 2; ++i) {
			if (checkPrime(i)) {
				if (checkPrime(n - i)) {
					System.out.println(i + "+" + (n - i));
					c = true;
				}
			}
		}
		if (!c)
			System.out.println(" cannot be expressed as the sum of two prime numbers ");
	}

	static boolean checkPrime(int num) {
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}
}
