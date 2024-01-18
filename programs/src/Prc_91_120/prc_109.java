package Prc_91_120;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//we use buffred reader for reading the text from the file line by line 
public class prc_109 {
	public static void main(String[] args) {
		String filePath = "/home/jigyasa_yadav/linebyLine.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
