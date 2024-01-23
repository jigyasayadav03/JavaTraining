package Prc_121_150;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class prc_141 {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		System.out.println(al);
		System.out.println("using for loop");
		for (int i : al) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("using  lambda function");
		al.forEach(item -> {

			System.out.print(item + " ");
		});
		System.out.println();
		System.out.println("using iterator");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer a = itr.next();
			System.out.print(a);
		}
	}
}
