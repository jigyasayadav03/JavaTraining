package Prc_31_60;

import java.util.Scanner;

public class prc_48 {

	public static void main(String args[]) {
		int i, j;
		System.out.println("Enter size of rows and columns: ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
		System.out.println("Enter matrix elements:");
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("The above matrix before Transpose is ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("The above matrix after Transpose is ");
		for (i = 0; i < column; i++) {
			for (j = 0; j < row; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println(" ");
		}
	}
}