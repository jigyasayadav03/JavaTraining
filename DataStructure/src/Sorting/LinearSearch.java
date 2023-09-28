package Sorting;

public class LinearSearch {
	public void search(int arr[], int k) {
		// k =elemnt
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("element found in the array ");

		} else {
			System.out.println("element not found");
		}
	}

	public static void main(String[] args) {
		LinearSearch b = new LinearSearch();
		int arr[] = { 2, 6, 7, 8, 4, 1, 5, 3 };
		int n = arr.length;
		b.search(arr, 9);

	}
}
