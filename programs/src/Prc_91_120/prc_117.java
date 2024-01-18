package Prc_91_120;

public class prc_117 {
	public enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		Days day = Days.MONDAY;
		switch (day) {
		case SUNDAY:
			System.out.println("this is the first day ");
			break;
		case MONDAY:
			System.out.println("this is the secon day of week");
			break;
		case TUESDAY:
			System.out.println("this is the third day of week");
			break;
		case WEDNESDAY:
			System.out.println("this is the fourth day of week");
			break;
		case THURSDAY:
			System.out.println("this is the fifth day of week");
			break;
		case FRIDAY:
			System.out.println("this is the sixth day of week");
			break;
		case SATURDAY:
			System.out.println("this is the seventh day of week");
			break;
		default:
			System.out.println("enter valid");
			break;
		}

	}
}
