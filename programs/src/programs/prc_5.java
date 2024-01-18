package programs;

import java.util.Scanner;

public class prc_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num ");
		int n = sc.nextInt();
		System.out.println("enter the divisor:");
		int d = sc.nextInt();
		int quotient = n / d;
		int remainder = n % d;
		System.out.println("the remainder is " + remainder);
		System.out.println("the quotient is " + quotient);

	}

}
