package programs;

import java.util.Scanner;

public class prc_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int lcm = (a * b) / findGCD(a, b);

		System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
	}

	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return Math.abs(a);
	}
}
