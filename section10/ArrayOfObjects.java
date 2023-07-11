/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10;

/**
 *
 * @author jigyasa_yadav
 */
public class ArrayOfObjects {
	public static void main(String args[])
        {
		Student[] arr;
		arr = new Student[2];
		arr[0] = new Student(1708, "Satyabrata");
		arr[1] = new Student(1709, "Omm");
		System.out.println(
			"Student data in student arr 0: ");
		arr[0].display();

		System.out.println(
			"Student data in student arr 1: ");
		arr[1].display();
	}
}
class Student {
	public int id;
	public String name;
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	
	public void display()
	{
		System.out.println("Student id is: " + id + " "
						+ "and Student name is: "
						+ name);
		System.out.println();
	}
}

