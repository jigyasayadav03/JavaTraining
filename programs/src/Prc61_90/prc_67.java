package Prc61_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prc_67 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("this");
		list.add("is");
		list.add("me");

		String[] arr = list.toArray(new String[0]);
		System.out.println("list to array");

		for (String x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();
		System.out.println("array to list");
		Integer[] Array = { 4, 5, 6 };
		List<Integer> intList = arrayToList(Array);
		System.out.println("List elements: " + intList);
	}

	private static <T> List<T> arrayToList(T[] array) {
		return new ArrayList<>(Arrays.asList(array));
	}
}
