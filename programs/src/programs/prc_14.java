package programs;

import java.util.Scanner;

public class prc_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number till where you want the sum");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("the sum is :" + sum);
	}
}
