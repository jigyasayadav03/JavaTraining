package programs;

import java.util.Scanner;

public class prc_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number whose table you want to print");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
