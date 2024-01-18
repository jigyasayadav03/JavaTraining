package Prc61_90;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class prc_73 {

	public static void main(String[] args) {

		try (FileOutputStream fout = new FileOutputStream("/home/jigyasa_yadav/FileWritingDemo.txt", true)) {
			String strAppend = "\nAppending more text to the file.";
			byte[] bytes = strAppend.getBytes();
			fout.write(bytes);
		} catch (IOException e) {
			System.out.println("Error appending to file: " + e.getMessage());
		}

		try (FileReader fileReader = new FileReader("/home/jigyasa_yadav/FileWritingDemo.txt")) {
			int i;
			while ((i = fileReader.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println("Error reading from file: " + e.getMessage());
		}
	}
}
