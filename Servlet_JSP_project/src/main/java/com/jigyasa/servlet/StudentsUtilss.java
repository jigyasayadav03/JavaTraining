package com.jigyasa.servlet;


import java.util.ArrayList;
import java.util.List;


public class StudentsUtilss{

	public static List<Studentsss> getStudents() {
		
		// create an empty list
		List<Studentsss> students = new ArrayList<>();
		
		// add sample data
		students.add(new Studentsss("Jigyasa", "yadav", "jigyasayadav190@.com"));
		students.add(new Studentsss("Jiya", "Dev", "jiyadev.123@com"));
		
		// return the list
		return students;
	}
}


