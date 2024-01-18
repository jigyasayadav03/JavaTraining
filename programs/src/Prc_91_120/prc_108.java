package Prc_91_120;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class prc_108 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("/home/jigyasa_yadav/WritingandReading.txt", true);

		String s = "hello worlddd!!";
		byte[] b = s.getBytes();
		fout.write(b);
		System.out.println("text written");
		fout.close();

		FileInputStream fin = new FileInputStream("/home/jigyasa_yadav/WritingandReading.txt");
		int i;
		while ((i = fin.read()) != -1) {
			System.out.print((char) i);

		}
		fin.close();

	}
}
