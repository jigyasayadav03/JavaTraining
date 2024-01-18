package Prc_31_60;

import java.util.Scanner;

public class prc_47 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows and columns in matrix:");
		n = sc.nextInt();
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
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
		multiplyMatrix(a, b, n);

	}

	public static void multiplyMatrix(int a[][], int b[][], int n) {
		int c[][] = new int[n][n];

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
