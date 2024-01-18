package Prc_31_60;

import java.util.Scanner;

public class prc_58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		double n = sc.nextDouble();
		System.out.println("Enter the number of decimal places to round to:");
		int k = sc.nextInt();
		double factor = Math.pow(10, k);
		double roundedNumber = Math.round(n * factor) / factor;
		System.out.println("result: " + roundedNumber);
	}
}
