package Prc_91_120;

import java.io.File;

public class prc_111 {
	public static void main(String[] args) {
		File path= new File("/home/jigyasa_yadav/Directory");

		if (path.exists()) {
			path.delete();
			System.out.println("Directory deleted successfully");

		} else {
			System.out.println("Directory does not exist");
		}
	}
}
