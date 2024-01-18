package Prc_121_150;

public class prc_124 {
	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("hello world");

		System.out.println("string is: " + str);
		str.delete(0, str.length());
System.out.println(str);
	}
}