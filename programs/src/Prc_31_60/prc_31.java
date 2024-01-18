package Prc_31_60;

import java.util.Scanner;

public class prc_31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number whose factors you want: ");
		int n = sc.nextInt();
		if (n == 0 && n == 1) {
			System.out.println("enter a valid number");
		}
		System.out.println("the factors are :");
		System.out.println("1");
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}
}
