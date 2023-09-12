package Sorting;

import java.util.*;

public class BubbleSort {
	public static void bubblesort(int arr[], int n) {
		int i = 0;
		int temp = 0;
		for (i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.print(arr[i] + ",");
		}
	}
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int arr[] = new int[n];
		int i;
		for (i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		bubblesort(arr, n);
	}
}
