package Prc61_90;

public class prc_90 {
	public static void main(String[] args) {
		try {
			int i = 10;
			String s = Integer.toString(i);
			System.out.println(s.getClass() + "is the datatype of " + s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}