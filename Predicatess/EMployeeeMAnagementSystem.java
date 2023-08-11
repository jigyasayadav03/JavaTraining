/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicatess;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author jigyasa_yadav
 */
class Employeeeee {

    String name;
    String designation;
    String city;
    float sallary;

    public Employeeeee(String name, String designation, String city, float sallary) {
        this.name = name;
        this.designation = designation;
        this.city = city;
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "{" + name + "," + designation + "," + city + ", " + sallary + '}';
    }

}

public class EMployeeeMAnagementSystem {

    public static void main(String[] args) {
        ArrayList<Employeeeee> al = new ArrayList<>();
        al.add(new Employeeeee("Jigyasa", "developer", "Indore", 21000));
        al.add(new Employeeeee("Jaya", "IOs", "Banglore", 23000));
        al.add(new Employeeeee("Harshit", "developer", "Jhabua", 21000));
        al.add(new Employeeeee("Roshan", "UI/Ux", "Maheshwar", 16000));
        al.add(new Employeeeee("Abhigyan", "UI/Ux", "Indore", 18000));
        al.add(new Employeeeee("Ayushi", "QA", "Indore", 17000));
        al.add(new Employeeeee("Sarikaa", "QA", "Bhopal", 17000));
        //prints whole list of employes
        System.out.println("***********************************");
        System.out.println("list of all employees");
        System.out.println("***********************************");
        for (Employeeeee e : al) {
            System.out.println(e);
        }
        System.out.println("***************************************");
        //p predicate for printing all the employees who are developer 
        System.out.println("list of the employees who are devlopers");
        System.out.println("***********************************");
        Predicate<Employeeeee> p = (e) -> e.designation.equals("developer");
        for (Employeeeee e : al) {
            if (p.test(e)) {
                System.out.println(e);
            }
        }
        System.out.println("***************************************");
        //p predicate for printing all the employees whose sallry is >= 18000
        System.out.println("list of the employees whose sallry is greater then 18000");
        System.out.println("***********************************");
        Predicate<Employeeeee> p1 = (e) -> e.sallary >= 18000;
        for (Employeeeee e : al) {
            if (p1.test(e)) {
                System.out.println(e);
            }
        }
        System.out.println("***************************************");
        //p predicate for printing all the employees who are not developers
        System.out.println("list of the employees who are not developers ");
        System.out.println("***********************************");

        Predicate<Employeeeee> p3 = p.negate();
        for (Employeeeee e : al) {
            if (p3.test(e)) {
                System.out.println(e);
            }
        }
        System.out.println("***********************************");
        System.out.println("***********************************");

        Predicate<Employeeeee> p4 = p.and(p1);

        for (Employeeeee e : al) {
            if (p4.test(e)) {
                System.out.println(e);
            }
        }
    }
}
