package Prc_121_150;

public class prc_132 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		if ((b1 && b2) || (b1 && b3) || (b2 && b3)) {
			System.out.println("two booleans variable are true.");
		} else {
			System.out.println("no two true boolean variable ");
		}
	}
}
