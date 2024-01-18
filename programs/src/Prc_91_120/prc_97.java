package Prc_91_120;

import java.util.Scanner;

public class prc_97 {
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
		System.out.println();
		int low = 0;
		int high = n - 1;

		quickSort(arr, low, high);
		System.out.println("the array after sort is");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void quickSort(int arr[], int low, int high) {

		if (low < high) {
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;

		return i;
	}
}
