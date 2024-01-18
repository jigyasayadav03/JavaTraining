package Prc61_90;

import java.util.HashSet;
import java.util.Set;

public class prc_70 {
	public static void main(String[] args) {
//for set to array

		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1124);
		hashSet.add(3654);
		hashSet.add(7854);
		hashSet.add(9945);
		System.out.println(hashSet);
		Integer[] array = new Integer[hashSet.size()];
		int j = 0;
		for (Integer i : hashSet) {
			array[j++] = i;
		}

		// for array
		int arr[] = { 1, 2, 3, 4, 3, 5, 4 };
		Set<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
		System.out.println(hs.getClass());
	}
}
