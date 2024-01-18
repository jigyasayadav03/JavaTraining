package programs;

import java.util.Scanner;

public class prc_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the last term till you want the series");
		int n = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3;
		System.out.println("the series");
		System.out.println(f1);
		System.out.println(f2);
		for (int i = 1; i < n; i++) {
			f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
		}
	}
}
