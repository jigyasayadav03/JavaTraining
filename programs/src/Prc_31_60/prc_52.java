package Prc_31_60;

class ComplexNumber {
	double real;
	double imaginary;

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
		double realSum = num1.real + num2.real;
		double imaginarySum = num1.imaginary + num2.imaginary;
		return new ComplexNumber(realSum, imaginarySum);
	}

	public void display() {
		System.out.println("Complex Number: " + real + " + " + imaginary + "i");
	}
}

public class prc_52 {
	public static void main(String[] args) {
		ComplexNumber complex1 = new ComplexNumber(2.5, 3.0);
		ComplexNumber complex2 = new ComplexNumber(1.5, 2.5);
		ComplexNumber sum = ComplexNumber.add(complex1, complex2);
		System.out.println("Sum of Complex Numbers:");
		sum.display();
	}
}
