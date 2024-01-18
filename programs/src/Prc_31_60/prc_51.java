package Prc_31_60;

public class prc_51 {
	public static void main(String[] args) {
		String[] str = { "hello", "my", "boy", "a", "girls" };
		Lsort(str);
		System.out.println("Lexicographical Order:");
		for (String word : str) {
			System.out.println(word);
		}
	}

	public static void Lsort(String[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
