package Prc_91_120;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class prc_105 {

	public static void main(String[] args) {

		String ipstr = "Hello,I am girl";
		byte[] byteArray = ipstr.getBytes();

		InputStream stream = new ByteArrayInputStream(byteArray);
		try {
			int data;
			while ((data = stream.read()) != -1) {
				System.out.print((char) data);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
