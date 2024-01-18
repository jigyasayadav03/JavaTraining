package Prc_91_120;

public class prc_104 {
	static void myMethod() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("hello ");
		}
	}

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		myMethod();
		long endTime = System.currentTimeMillis();
		long Time = endTime - startTime;
		System.out.println("Execution time: " + Time + " milliseconds");
	}
}
