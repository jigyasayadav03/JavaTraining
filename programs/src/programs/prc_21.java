package programs;

import java.util.Scanner;

public class prc_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the digit");
		int n = sc.nextInt();
		int rem;
		int count = 0;
		while (n != 0) {
			rem = n % 10;
			count++;
			n = n / 10;
		}
		System.out.println(count);
	}
}
