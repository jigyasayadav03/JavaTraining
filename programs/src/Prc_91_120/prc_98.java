package Prc_91_120;

public class prc_98 {
	public static void main(String args[]) {
		int arr[] = { 1, 3, 9, 2, 4, 6, 8, 7 };
		int low = 0;
		int high = arr.length - 1;
		mergeSort(arr, low, high);
		printArray(arr);
	}

	static void merge(int[] A, int left, int middle, int right) {
		int[] leftTmp = new int[middle - left + 2];
		int[] rightTmp = new int[right - middle + 1];
		for (int i = 0; i <= middle - left; i++) {
			leftTmp[i] = A[left + i];
		}
		for (int i = 0; i < right - middle; i++) {
			rightTmp[i] = A[middle + 1 + i];
		}

		leftTmp[middle - left + 1] = Integer.MAX_VALUE;
		rightTmp[right - middle] = Integer.MAX_VALUE;

		int i = 0, j = 0;
		for (int k = left; k <= right; k++) {
			if (leftTmp[i] < rightTmp[j]) {
				A[k] = leftTmp[i];
				i++;
			} else {
				A[k] = rightTmp[j];
				j++;
			}

		}

	}

	public static void mergeSort(int[] Array, int left, int right) {
		if (right > left) {
			int m = (left + right) / 2;
			mergeSort(Array, left, m);
			mergeSort(Array, m + 1, right);
			merge(Array, left, m, right);
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

}