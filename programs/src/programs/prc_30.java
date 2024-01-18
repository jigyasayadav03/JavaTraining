package programs;

import java.util.Scanner;

public class prc_30 {
	static void checkArmstrong(int a, int b) {
		for (int i = a; i <= b; i++) {
			int temp = i;
			int digits = 0;
			double sum = 0;

			// Counting digits
			while (temp != 0) {
				temp = temp / 10;
				digits++;
			}
			temp = i;
			while (temp != 0) {
				int rem = temp % 10;
				sum = sum + Math.pow(rem, digits);
				temp = temp / 10;
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		checkArmstrong(a, b);
	}
}
