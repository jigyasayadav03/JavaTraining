package programs;

import java.util.Scanner;

public class prc_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int count = 1;
		if (n <= 1) {
			System.out.println("enter a valid number");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("number is not a prime");
			} else
				System.out.println("prime number");
		}
	}
}
