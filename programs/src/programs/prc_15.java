package programs;

import java.util.Scanner;

public class prc_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number whose factoriaL YOU WANT");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("the factorial is :" + fact);
	}
}
