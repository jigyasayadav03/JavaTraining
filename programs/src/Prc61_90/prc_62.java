package Prc61_90;

public class prc_62 {
	public static void main(String[] args) {

		String str1 = "Hellooo!";
		String str2 = "";
		String str3 = null;
		check(str1);
		check(str2);
		check(str3);
	}

	public static void check(String str) {
		if (str != null && !str.isEmpty()) {
			System.out.println("The string" + str + " is neither empty nor null.");
		} else if (str == null) {
			System.out.println("The string is null.");
		} else {
			System.out.println("The string is empty.");
		}
	}
}