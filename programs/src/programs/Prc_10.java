package programs;

import java.util.Scanner;

public class Prc_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a, b, and c:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double root1;
		double root2;
		double discriminant = b * b - 4 * a * c;

		if (discriminant == 0) {
			double realPart = -b / (2 * a);
		} else if (discriminant < 0) {
			System.out.println("no real roots");
		} else {
			root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The roots are: " + root1 + " and " + root2);
		}
	}
}
