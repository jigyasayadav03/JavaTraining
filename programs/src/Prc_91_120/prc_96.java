package Prc_91_120;

import java.util.Scanner;

public class prc_96 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int n = sc.nextInt();
		System.out.println("enter the array elemnts: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("the array is");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("the array after sorting");
			for (int a : arr) {
				System.out.print(a + " ");
			}

		}
	}
}
