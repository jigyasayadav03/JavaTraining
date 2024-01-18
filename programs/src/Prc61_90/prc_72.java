package Prc61_90;

import java.io.FileInputStream;
import java.io.IOException;

public class prc_72 {

	public static void main(String[] args) throws Exception {

		try {
			try (FileInputStream fin = new FileInputStream("/home/jigyasa_yadav/FileWritingDemo.txt/")) {
				int i = 0;
				while ((i = fin.read()) != -1) {
					System.out.print((char) i);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
