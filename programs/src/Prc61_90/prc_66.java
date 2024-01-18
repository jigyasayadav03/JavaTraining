package Prc61_90;

import java.util.ArrayList;
import java.util.List;

public class prc_66 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(5);
		l1.add(4);

		List<Integer> List = new ArrayList<>(l1);
		List.addAll(l2);

		System.out.println("List 1: " + l1);
		System.out.println("List 2: " + l2);
		System.out.println("Joined List: " + List);
	}
}
