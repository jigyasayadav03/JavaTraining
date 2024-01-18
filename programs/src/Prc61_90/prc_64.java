package Prc61_90;

import java.util.Scanner;

public class prc_64 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter milliseconds: ");
		long milliseconds = scanner.nextLong();
		convertMilliseconds(milliseconds);
	}

	public static void convertMilliseconds(long milliseconds) {
		long totalSeconds = milliseconds / 1000;
		long minutes = totalSeconds / 60;
		long seconds = totalSeconds % 60;
		System.out.println(
				milliseconds + " milliseconds is equivalent to " + minutes + " minutes and " + seconds + " seconds.");
	}
}
