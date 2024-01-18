package Prc_31_60;

import java.util.Scanner;

public class prc_42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int n = sc.nextInt();
		System.out.println("enter the array elemnts: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int avg, sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		avg = sum / n;
		System.out.println("average is :" + avg);
	}
}
