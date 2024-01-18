package Prc_121_150;

public class prc_122 {
	public static void permutation(String str, String s) {
		if (str.length() == 0) {
			System.out.print(s + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			String res = str.substring(0, i) + str.substring(i + 1);
			System.out.println(res);
			permutation(res, s + c);
			}

	}

	public static void main(String[] args) {
		String str = "this";
		permutation(str, " ");

	}
}
