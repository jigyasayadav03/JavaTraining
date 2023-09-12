package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String arr[]) {
	ArrayList<Integer> a=new ArrayList<>();
	a.add(1);
	a.add(0,3);
	a.add(5);
	a.add(7);
	a.add(10);
	a.remove(2);
	System.out.println(a);
	System.out.println(a.get(0));
	System.out.println(a.contains(9));
	
}
}
