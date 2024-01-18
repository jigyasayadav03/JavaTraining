package Prc_31_60;

public class prc_60 {

	public static void main(String[] args) {

		char charV = 'A';
		String stringValue = charToString(charV);
		System.out.println("Char to String: " + stringValue);
		String strV = "i am a girl";
		char charResult = stringToChar(strV);
		System.out.println("String to Char: " + charResult);
	}

	public static String charToString(char c) {
		return String.valueOf(c);
	}

	public static char stringToChar(String str) {
		if (str.length() == 1) {
			return str.charAt(0);
		} else {
			throw new IllegalArgumentException("String must be one character");
		}
	}
}
