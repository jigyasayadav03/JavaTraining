package Prc61_90;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class prc_75 {
	// byte array to file
	public static void main(String[] args) throws IOException {
		byte[] byteArray = { 65, 66, 67, 68, 69 };

		String outputPath = "/home/jigyasa_yadav/byteArray.txt";
		try {
			byteToFile(byteArray, outputPath);
			System.out.println("File successfully created at: " + outputPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// for file to byte array
		File path = new File("/home/jigyasa_yadav/byteArray.txt");
		byte[] array = fileToByte(path);
		System.out.print(Arrays.toString(array));
	}

	private static void byteToFile(byte[] byteArray, String outputPath) throws IOException {
		File outputFile = new File(outputPath);

		try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
			fileOutputStream.write(byteArray);
		}
	}

	public static byte[] fileToByte(File file) throws IOException {

		FileInputStream fl = new FileInputStream(file);
		byte[] arr = new byte[(int) file.length()];
		fl.read(arr);
		fl.close();

		return arr;
	}
}
