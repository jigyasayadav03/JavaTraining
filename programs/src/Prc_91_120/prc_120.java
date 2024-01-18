package Prc_91_120;

final class School {
	final String location = "Ahmedabad";
	final String name = "xyz school";
	final String medium = "English";
	int numberofStudents;

	public int getNumberofStudents() {
		return numberofStudents;
	}

	public void setNumberofStudents(int numberofStudents) {
		this.numberofStudents = numberofStudents;
	}

	public School(int numberofStudents) {
		super();
		this.numberofStudents = numberofStudents;
	}

	@Override
	public String toString() {
		return "School [location=" + location + ", name=" + name + ", medium=" + medium + ", numberofStudents="
				+ numberofStudents + "]";
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public String getMedium() {
		return medium;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class prc_120 {
	public static void main(String[] args) {
School school=new School(1000);
System.out.println(school);
	}
}
