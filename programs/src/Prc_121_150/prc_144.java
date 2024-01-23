package Prc_121_150;

import java.util.ArrayList;
import java.util.List;

public class prc_144 {
	public static void main(String[] args) {
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		System.out.println("the first list is ");
		System.out.println(al1);
		List<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(6);
		al2.add(7);
		al2.add(8);
		System.out.println("the second list is ");
		System.out.println(al2);
		List<Integer> al3 = new ArrayList<Integer>();
		al3.addAll(al1);
		al3.addAll(al2);
		System.out.println("the merge list is ");
		System.out.println(al3);
	}
}
