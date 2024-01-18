package Prc_31_60;

public class prc_37 {
	public static void main(String[] args) {
		long num = 110110111;
		int decimal = convertBinaryToDecimal(num);

		System.out.println("Binary to Decimal");
		System.out.println(num + " = " + decimal);

		int decimalNumber = 123;
		long binary = convertDecimalToBinary(decimalNumber);

		System.out.println("Decimal to Binary");
		System.out.println(decimalNumber + " = " + binary);
	}

	public static int convertBinaryToDecimal(long num) {
		int decimalNumber = 0, i = 0;
		long remainder;

		while (num != 0) {
			remainder = num % 10;
			num /= 10;
			decimalNumber += remainder * Math.pow(2, i);
			++i;
		}

		return decimalNumber;
	}

	public static long convertDecimalToBinary(int decimal) {
		long binaryNumber = 0;
		int remainder, i = 1;

		while (decimal != 0) {
			remainder = decimal % 2;
			decimal /= 2;
			binaryNumber += remainder * i;
			i *= 10;
		}

		return binaryNumber;
	}
}
