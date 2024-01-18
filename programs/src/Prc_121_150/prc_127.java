package Prc_121_150;

public class prc_127 {
	public static void main(String[] args) {
		String s1 = "jigyasa";
		String s2 = "jigyasa";
		String s3 = new String("jigyasa");
		System.out.println("string 1: " + s1);
		System.out.println("string 2: " + s2);
		System.out.println("string 3: " + s3);
		System.out.println("using equls method: s1 and s3");
		boolean t = s1.equals(s3);
		System.out.println(t);
		System.out.println("using == operator : s1 vand s3 ");
		if (s1 == s3) {
			System.out.println("they are equal ");
		} else {
			System.out.println("they are not equal");
		}
		System.out.println("using equls method: s1 and s2");
		boolean t1 = s1.equals(s2);
		System.out.println(t1);
		System.out.println("using == operator : s1 vand s2 ");
		if (s1 == s2) {
			System.out.println("they are equal ");
		} else {
			System.out.println("they are not equal");
		}
	}
}
