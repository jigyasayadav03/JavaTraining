package Prc_91_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class prc_112 {

	public static void main(String[] args) {
		String fileName = getFileExtension("/home/jigyasa_yadav/inputFile.txt/");
		System.out.println("File Extension: " + fileName);
	}

	private static String getFileExtension(String filePath) {

		Path path = Paths.get(filePath);
		String fileName = path.getFileName().toString();
		int lastDotIndex = fileName.lastIndexOf('.');
		if (lastDotIndex > 0 && lastDotIndex < fileName.length() - 1) {
			return fileName.substring(lastDotIndex + 1);
		}

		return null;
	}
}
