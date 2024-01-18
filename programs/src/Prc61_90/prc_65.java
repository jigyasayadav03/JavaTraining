package Prc61_90;

import java.time.LocalDate;

public class prc_65 {
	public static void main(String[] args) {
		String date1Str = "2022-01-15";
		String date2Str = "2022-02-20";
		LocalDate date1 = LocalDate.parse(date1Str);
		LocalDate date2 = LocalDate.parse(date2Str);

		LocalDate result = date1.plusDays(date2.getDayOfMonth()).plusMonths(date2.getMonthValue())
				.plusYears(date2.getYear());
		System.out.println("Date 1: " + date1);
		System.out.println("Date 2: " + date2);
		System.out.println("Sum of Dates: " + result);
	}
}
