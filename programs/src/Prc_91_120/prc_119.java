package Prc_91_120;

import java.util.Scanner;

class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}

class Num {
	public static double calSquare(double n) throws CustomException {
		if (n < 0) {
			throw new CustomException("number must be positive.");
		}
		return Math.sqrt(n);
	}
}

public class prc_119 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Enter a number: ");
			double num = sc.nextDouble();
			double res = Num.calSquare(num);
			System.out.println("Square root of " + num + "is:" + res);

		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
