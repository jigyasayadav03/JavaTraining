/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoArgument;

/**
 *
 * @author jigyasa_yadav
 */
import java.util.function.*;
import java.util.*;

class Employeeeeee {

    String name;
    double salary;

    Employeeeeee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class IncrementSallary {

    public static void main(String[] args) {
        ArrayList<Employeeeeee> l = new ArrayList<Employeeeeee>();
        l.add(new Employeeeeee("jigyasa", 1000));
        l.add(new Employeeeeee("ginny", 2000));
        l.add(new Employeeeeee("honey", 3000));

        BiConsumer<Employeeeeee, Double> c = (e, d) -> e.salary = e.salary + d;
        for (Employeeeeee e : l) {
            c.accept(e, 500.0);
        }
        for (Employeeeeee e : l) {
            System.out.println("Employee Name:" + e.name);
            System.out.println("Employee Salary:" + e.salary);
            System.out.println();
        }
    }

}
