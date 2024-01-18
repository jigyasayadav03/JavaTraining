package Prc_91_120;

public class prc_93 {
	public static void main(String[] args) {
		try {

			String s = "22.55";
			double d = Double.parseDouble(s);
			System.out.println(d);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}