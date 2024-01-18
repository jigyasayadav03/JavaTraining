package programs;

import java.util.Scanner;

public class prc_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number here:");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("numberr is even ");

		} else {
			System.out.print("number is odd");
		}
	}

}
