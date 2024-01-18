package Prc_31_60;

public class prc_38 {

	public static void main(String[] args) {

		int octal = 456;
		int decimalOctal = convertOctalDecimal(octal);
		System.out.println("Octal to Decimal");
		System.out.println(octal + " = " + decimalOctal);
		int decimal = 789;
		int octalDecimal = convertDecimalOctal(decimal);

		System.out.println("Decimal to Octal");
		System.out.println(decimal + " = " + octal);
	}

	public static int convertOctalDecimal(int octal) {
		int decimalNumber = 0, i = 0;
		int remainder;

		while (octal != 0) {
			remainder = octal % 10;
			octal /= 10;
			decimalNumber += remainder * Math.pow(8, i);
			++i;
		}

		return decimalNumber;
	}

	public static int convertDecimalOctal(int decimal) {
		int octalNumber = 0, i = 1;
		int remainder;

		while (decimal != 0) {
			remainder = decimal % 8;
			decimal /= 8;
			octalNumber += remainder * i;
			i *= 10;
		}

		return octalNumber;
	}
}
