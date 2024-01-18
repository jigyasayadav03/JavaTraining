package Prc_121_150;

public class prc_133 {
	enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,
	}

	public static void main(String[] args) {

		System.out.println();
		for (Days day : Days.values()) {
			System.out.println(day);
		}
	}
}
