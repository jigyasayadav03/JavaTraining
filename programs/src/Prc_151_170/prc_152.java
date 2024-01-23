package Prc_151_170;

import java.util.HashSet;
import java.util.Set;

public class prc_152 {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(4);
		s.add(5);
		s.add(3);
		System.out.println("the  set 1 is ");
		System.out.println(s);
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s1.add(6);
		System.out.println("the set 2 is ");
		System.out.println(s1);
		boolean i = s1.containsAll(s);
		if (i) {
			System.out.println("set one is a subset of set 2.");
		} else {
			System.out.println("not a subset");
		}
	}
}
