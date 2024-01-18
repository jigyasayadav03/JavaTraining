package Prc61_90;

import java.util.ArrayList;

public class prc_81 {
	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		list.add(new Object("Zebra"));
		list.add(new Object("Apple"));
		list.add(new Object("Ball"));
		list.add(new Object("cello"));
		list.add(new Object("Xylo"));
		list.add(new Object("Abhi"));

		list.sort((o1, o2) -> o1.getProperty().compareTo(o2.getProperty()));

		for (Object obj : list) {
			System.out.println(obj.getProperty());
		}
	}
}

class Object {

	public String property;

	public Object(String property) {
		this.property = property;
	}

	public String getProperty() {
		return this.property;
	}

}