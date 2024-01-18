package Prc61_90;

import java.io.PrintWriter;
import java.io.StringWriter;

public class prc_74 {
	public static void main(String[] args) {
		try {

			int result = divide(10, 0);
		} catch (Exception e) {
			String stackTraceString = getStackTraceAsString(e);
			System.out.println(stackTraceString);
		}
	}

	public static int divide(int a, int b) {
		return a / b;
	}

	public static String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();
	}
}
