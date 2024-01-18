package Prc_31_60;

public class prc_59 {
	public static void main(String[] args) {
		int[] array1 = { 1, 21, 23, 54, 75 };
		int[] array2 = { 46, 97, 58, 49, 3 };
		int[] resultArray = concatenateArrays(array1, array2);
		System.out.print("Concatenated Array: ");
		for (int element : resultArray) {
			System.out.print(element + " ");
		}
	}

	public static int[] concatenateArrays(int[] array1, int[] array2) {
		int l1 = array1.length;
		int l2 = array2.length;

		int[] resultArray = new int[l1 + l2];
		for (int i = 0; i < l1; i++) {
			resultArray[i] = array1[i];
		}
		for (int i = 0; i < l2; i++) {
			resultArray[l1 + i] = array2[i];
		}

		return resultArray;
	}
}
