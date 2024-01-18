package programs;

import java.util.Scanner;

public class prc_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in which intervals you want:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Prime numbers are:");

		for (int i = a; i <= b; i++) {
			int count = 0;

			for (int j = 2; j <= i / 2; j++) {
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
}
