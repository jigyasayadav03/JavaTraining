package Prc_31_60;

public class prc_55 {
	public static void main(String[] args) {
		String str = "Hello,   World! This is a test string.";

		String stringWithoutspaces = removeWhitespaces(str);

		System.out.println("Original String: " + str);
		System.out.println("String without Whitespaces: " + stringWithoutspaces);
	}

	private static String removeWhitespaces(String s) {
		char[] ch = s.toCharArray();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (ch[i] != ' ') {
				result.append(ch[i]);
			}
		}

		return result.toString();
	}
}
