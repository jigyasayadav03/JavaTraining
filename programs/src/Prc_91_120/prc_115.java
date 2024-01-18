package Prc_91_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class prc_115 {

	public static void main(String[] args) {
		String path = "/home/jigyasa_yadav/linebyLine.txt";
		try {
			int count = countLines(path);
			System.out.println(count);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	private static int countLines(String fpath) throws IOException {
		Path p = Paths.get(fpath);
		List<String> l = Files.readAllLines(p);

		return l.size();
	}
}
