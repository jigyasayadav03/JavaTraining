package Prc_91_120;

interface Operation {
	double operate(double num1, double num2);
}

public class prc_102 {
	static double perform(double n1, double n2, Operation op) {
		return op.operate(n1, n2);
	}

	public static void main(String[] args) {
		double resultAdd = perform(5, 3, (a, b) -> a + b);
		System.out.println("Addition Result: " + resultAdd);

	}

}
