package Prc61_90;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class prc_77 {
	public static void main(String[] args) {
		OutputStream outputStream = new ByteArrayOutputStream();
		try {
			writeToOutputStream(outputStream);
			String result = convertOutputStreamToString((ByteArrayOutputStream) outputStream);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeToOutputStream(OutputStream outputStream) throws IOException {
		String data = "Hello, OutputStream to String!";
		outputStream.write(data.getBytes(StandardCharsets.UTF_8));
	}

	public static String convertOutputStreamToString(ByteArrayOutputStream outputStream) {
		return outputStream.toString(StandardCharsets.UTF_8);
	}
}
