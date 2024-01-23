package Prc_121_150;

import java.util.HashSet;
import java.util.Set;

public class prc_150 {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
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
		System.out.println("the intersetion is :");
s.retainAll(s1);
System.out.println(s);
	}
}
