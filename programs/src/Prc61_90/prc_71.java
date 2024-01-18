package Prc61_90;

public class prc_71 {
	public static void main(String[] args) {

		byte[] bytes = { 10, 2, 15, 11 };

		for (byte b : bytes) {
			String st = String.format("%03X  ", b);
			System.out.print(st);
		}

	}
}
