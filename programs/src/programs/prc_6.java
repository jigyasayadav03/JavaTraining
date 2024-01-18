package programs;

import java.util.Scanner;

public class prc_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number here :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("values before swap a:" + a + "and b:" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("values after swap a:" + a + "and b:" + b);

	}
}
