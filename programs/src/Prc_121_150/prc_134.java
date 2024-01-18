package Prc_121_150;

import java.time.LocalDate;
import java.time.Month;

public class prc_134 {
	public static void main(String[] args) {

		int birthdate = 18;
		Month birthmonth = Month.JANUARY;
		LocalDate date = LocalDate.now();
		System.out.println(" Date is " + date);
		int d = date.getDayOfMonth();
		Month m = date.getMonth();
		if (d == birthdate && m == birthmonth) {
			System.out.println("Happy birthday to you.");
		}
	}
}
