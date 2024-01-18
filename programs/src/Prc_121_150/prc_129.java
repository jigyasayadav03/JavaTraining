package Prc_121_150;

import java.util.Scanner;

public class prc_129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle");
		float p = sc.nextFloat();
		System.out.println("enter the rate :");
		float r = sc.nextFloat();
		System.out.println("enter the time (in yrs):");
		int t = sc.nextInt();
		System.out.println("enter the number of times the interest is compounded");
		float n = sc.nextFloat();
		double a = amount(p, r, t, n);
		double CI = a - p;
		System.out.println("the compound interest is: " + CI);
	}

	private static double amount(float p, float r, int t, float n) {
		double rn = r / (n * 100);
		double P = p * (1 + rn);
		double A = Math.pow(P, n * t);
		return A;
	}
}
