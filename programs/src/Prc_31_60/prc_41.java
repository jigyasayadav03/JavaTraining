package Prc_31_60;

import java.util.Scanner;

public class prc_41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number here :");
		int n = sc.nextInt();
		System.out.println("enter the power here: ");
		int p = sc.nextInt();
		double power = calPower(n, p);
		System.out.println(power);
		sc.close();
	}

	public static double calPower(int n, int p) {

		if (p == 1 || n == 0) {
			return n;
		}

		return calPower(n, p - 1) * n;

	}
}
