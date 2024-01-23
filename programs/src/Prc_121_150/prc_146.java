package Prc_121_150;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class prc_146 {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(5);
		al.add(3);
		al.add(2);

		System.out.println("Array List");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer a = itr.next();
			System.out.print(a + " ");
		}
		System.out.println();
		removeDuplicates(al);
	}

	private static void removeDuplicates(List<Integer> al) {
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.addAll(al);

		System.out.println("after removeing duplicates");
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			Integer a = itr.next();
			System.out.print(a + " ");
		}

	}

}
