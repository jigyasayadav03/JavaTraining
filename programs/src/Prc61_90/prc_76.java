package Prc61_90;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class prc_76 {
	public static void main(String[] args) {
		String filePath = "/home/jigyasa_yadav/FileWritingDemo.txt";
		InputStream inputStream = null;

		try {
			inputStream = new FileInputStream(filePath);
			String result = convertInputStreamToString(inputStream);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String convertInputStreamToString(InputStream inputStream) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
			StringBuilder stringBuilder = new StringBuilder();
			String line;

			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line).append("\n");
			}

			return stringBuilder.toString();
		}
	}
}
