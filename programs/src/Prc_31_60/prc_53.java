package Prc_31_60;

import java.time.LocalTime;

public class prc_53 {
	public static void main(String[] args) {
		LocalTime startTime = LocalTime.of(6, 20, 45);
		LocalTime endTime = LocalTime.of(12, 45, 30);
		int hd = endTime.getHour() - startTime.getHour();
		int md = Math.abs(endTime.getMinute() - startTime.getMinute());
		int sd = Math.abs(endTime.getSecond() - startTime.getSecond());
		System.out.println("Time Difference:");
		System.out.println("Hours: " + hd);
		System.out.println("Minutes: " + md);
		System.out.println("Seconds: " + sd);
	}
}
