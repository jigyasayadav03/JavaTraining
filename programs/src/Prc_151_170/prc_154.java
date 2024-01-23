package Prc_151_170;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class prc_154 {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.print(i + " ");
		}
		System.out.println(" ");
		calculateSquare(al);
	}

	private static void calculateSquare(List<Integer> al) {
		for (int i = 0; i < al.size(); i++) {
			int sq = al.get(i) * al.get(i);
			al.set(i, sq);
		}
		System.out.println("the square of the elements in the list are :");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.print(i + " ");
		}

	}

}
