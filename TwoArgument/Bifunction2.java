/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoArgument;

import java.util.function.*;
import java.util.*;

/**
 *
 * @author jigyasa_yadav
 */
class Employee {

    int eno;
    String name;
    double dailyWage;

    Employee(int eno, String name, double dailyWage) {
        this.eno = eno;
        this.name = name;
        this.dailyWage = dailyWage;
    }
}

class TimeSheet {

    int eno;
    int days;

    TimeSheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }
}

public class Bifunction2 {

    public static void main(String[] args) {
        BiFunction<Employee, TimeSheet, Double> f = (e, t) -> e.dailyWage * t.days;
        Employee e = new Employee(101, "igyasa", 4500);
        TimeSheet t = new TimeSheet(101, 25);
        System.out.println("Employee Monthly Salary:" + f.apply(e, t));
    }
}
