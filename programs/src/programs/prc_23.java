package programs;

import java.util.Scanner;

public class prc_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println("enter the power of the number:");
		int p = sc.nextInt();
		int power = 1;
		for (int i = 1; i <= p; i++) {
			power = power * n;
		}
		System.out.println(power);
	}
}
