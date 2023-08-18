/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoArgument;

import java.util.function.BiFunction;
import java.util.*;

/**
 *
 * @author jigyasa_yadav
 */

class Student {

    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}

public class BiFunctionss {

    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();
        BiFunction<String, Integer, Student> f = (name, rollno) -> {
            return new Student(name, rollno);
        };

        l.add(f.apply("Jigyasa ", 100));
        l.add(f.apply("khushi", 200));
        for (Student s : l) {
            System.out.println("Student Name:" + s.name);
            System.out.println("Student Rollno:" + s.rollno);
            System.out.println();
        }
    }
}
