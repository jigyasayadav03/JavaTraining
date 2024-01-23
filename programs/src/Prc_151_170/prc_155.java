package Prc_151_170;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class prc_155 {
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

		System.out.println("\n using lambda");
		al.stream().forEach(a -> System.out.println(a + " "));
	}
}
