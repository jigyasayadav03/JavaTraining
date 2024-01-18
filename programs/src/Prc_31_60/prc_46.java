package Prc_31_60;

import java.util.Scanner;

public class prc_46 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows and columns in matrix:");
		n = sc.nextInt();
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];
		System.out.println("Enter all the elements of first matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter all the elements of second matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		// till here we have intializd the two array
		// for multiplication
		System.out.println("Generating the multiplication of matrices.....");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
