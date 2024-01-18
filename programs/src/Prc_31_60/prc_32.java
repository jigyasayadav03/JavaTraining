package Prc_31_60;

import java.util.Scanner;

public class prc_32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers here :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("select the operation you want to perform : " + " +  , - , *  ,  / ");
		char op = sc.next().charAt(0);
		switch (op) {
		case '+':
			System.out.println("the addition of the number is: ");
			System.out.println(a + b);
			break;
		case '-':
			System.out.println("the subtraction of the number is: ");
			System.out.println(a - b);
			break;
		case '*':
			System.out.println("the product of the number is: ");
			System.out.println(a * b);
			break;
		case '/':
			System.out.println("the division of the number is: ");
			System.out.println(a / b);
			break;
		default:
			System.out.println("select a operation from above mentioned list ");
			break;

		}

	}
}
