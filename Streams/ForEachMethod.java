
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jigyasa_yadav
 */
public class ForEachMethod {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Jigyasa");
        al.add("Rishabh");
        al.add("Roshan");
        al.add("Harshit");
        al.add("Bhavya");
        al.add("Abhigyan");
        System.out.println(al);
        //appliying foreach method
        al.stream().forEach(s -> System.out.println(s));
al.stream().forEach(System.out::println);
    }
}
