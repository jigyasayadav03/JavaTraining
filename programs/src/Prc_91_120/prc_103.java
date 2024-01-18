package Prc_91_120;

public class prc_103 {

	public int mul(int a, int b) {
		int prod = a * b;
		return prod;
	}

	public void square(int num) {
		int result = num * num;
		System.out.println(result);
	}

	public static void main(String[] args) {

		prc_103 p = new prc_103();
		p.square(p.mul(15, 9));

	}
}