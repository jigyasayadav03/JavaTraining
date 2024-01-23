package Prc_121_150;

import java.util.Arrays;
import java.util.LinkedList;

public class prc_139 {

	public static <T> Object[] linkedArray(LinkedList<T> ll) {
		return ll.toArray();
	}

	public static <T> LinkedList<T> arraylinkedList(T[] arr) {
		return new LinkedList<>(Arrays.asList(arr));
	}

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");

		Object[] arrayLinkedList = linkedArray(ll);
		System.out.println("Array from LinkedList: " + Arrays.toString(arrayLinkedList));
//for converting array to linked list
		String[] arr = { "A", "B", "C" };
		LinkedList<String> linkedListArray = arraylinkedList(arr);
		System.out.println("LinkedList from Array: " + linkedListArray);
	}
}
