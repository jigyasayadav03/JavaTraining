package Prc_31_60;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class prc_57 {
	public static void main(String[] args) {
		String s = "April, 5 2001";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, d yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(s, formatter);
		System.out.println(date);
	}
}
