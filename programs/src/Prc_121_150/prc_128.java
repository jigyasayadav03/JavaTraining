package Prc_121_150;

import java.util.Scanner;

public class prc_128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day which you want to see :");
		String s = sc.nextLine();
		switch (s) {
		case "MONDAY":
			System.out.println("the first day of week ");
			break;
		case "TUESDAY":
			System.out.println("the second day of week ");
			break;

		case "WEDNESDAY":
			System.out.println("the third day of week ");
			break;

		case "THURSDAY":
			System.out.println("the fouth day of week ");
			break;

		case "FRIDAY":
			System.out.println("the fifth day of week ");
			break;
		case "SATURDAY":
			System.out.println("the sixth day of week ");
			break;
		case "SUNNDAY":
			System.out.println("the last day of week ");
			break;
		default:
			System.out.println("enter valid");

		}
	}
}
