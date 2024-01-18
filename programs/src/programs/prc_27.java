package programs;

import java.util.Scanner;

public class prc_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number here:");
		int n = sc.nextInt();
		int x = n;
		int rem, sum = 0;
		while (n != 0) {
			rem = n % 10;
			sum = sum + rem * rem * rem;
			n = n / 10;
		}
		if (sum == x) {
			System.out.println("the number is armstrong number");
		} else
			System.out.println("not a armstrong number");
	}

}
