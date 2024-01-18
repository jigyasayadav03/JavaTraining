package Prc_91_120;

import java.io.File;

public class prc_110 {
	public static void main(String[] args) {

		File file = new File("/home/jigyasa_yadav/inputFile.txt/");

		if (file.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Failed to delete the file");
		}
	}
}
