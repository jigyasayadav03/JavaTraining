package Prc_121_150;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class prc_143 {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		Iterator<Integer> itr = s.iterator();
		{
			while (itr.hasNext()) {
				Integer a = itr.next();
				System.out.print(a + ", ");
			}
		}
		;
	}
}
