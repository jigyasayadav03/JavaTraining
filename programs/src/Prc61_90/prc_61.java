package Prc61_90;

import java.util.Scanner;

public class prc_61 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int n = sc.nextInt();
		System.out.println("enter the array elemnts: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the number you want to search for :");
		int k = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				System.out.println("element present");
			} else {
				System.out.println("elekenr not present");
			}
		}
	}
}
