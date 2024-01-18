package Prc_91_120;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class prc_106 {
	public static void main(String[] args) {
		try {
			byte[] b = { 1, 2, 3, 4 };
			InputStream stream = new ByteArrayInputStream(b);
			System.out.println("Input Stream: " + stream);
			byte[] arr = stream.readAllBytes();
			System.out.println("Byte Array: " + Arrays.toString(arr));

			stream.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
