/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionss;

import java.util.ArrayList;
import java.util.function.Function;

/**
 *
 * @author jigyasa_yadav
 */
class EmployeeS {

    String name;
    Double Sallery;

    public EmployeeS(String name, Double Sallery) {
        this.name = name;
        this.Sallery = Sallery;
    }

    @Override
    public String toString() {
       
        return "{" + "name=" + name + ", Sallery=" + Sallery + '}';
    }

}

public class EmployeeSallary {

    public static void main(String[] args) {
        //  EmployeeS e= new EmployeeS();
        ArrayList<EmployeeS> al = new ArrayList<>();
        al.add(new EmployeeS("Jigyasa ", 21000.45));
        al.add(new EmployeeS("Roshan ", 15000.45));
        al.add(new EmployeeS("Harsha ", 18000.566));
        al.add(new EmployeeS("Tasha ", 23000.58));
        al.add(new EmployeeS("Vihasa ", 21000.45));
        al.add(new EmployeeS("Harshit ", 19000.05));
        System.out.println(al);
        Function<ArrayList<EmployeeS>, Double> f = l -> {
            double total = 0.0;
            for (EmployeeS e : l) {
                total = total + e.Sallery;

            }
            return total;
        };
        System.out.println("the total sallery of all the employee is : " + f.apply(al));
 Function<ArrayList<EmployeeS>,ArrayList<EmployeeS> > f1 = l -> {
                        for (EmployeeS e : l) {
                            if(e.Sallery>20000.00){
              e.Sallery=e.Sallery+477;
                            }
            }
            return al;
        };
        System.out.println("the increment sallery is :"+f1.apply(al));
    }
}
