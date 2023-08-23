/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jigyasa_yadav
 */
public class MethodsForProcessing {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Jigyasa");
        al.add("Rishabh");
        al.add("Roshan");
        al.add("Harshit");
        al.add("Bhavya");
        al.add("Abhigyan");
        System.out.println(al);
        //appliying for the name whose length is greater then 6
        List<String> s = al.stream().filter(I -> I.length() > 6).collect(Collectors.toList());
        System.out.println("the filtered list is :");
        System.out.println(s);
        List<String> s1 = al.stream().map(I -> I.toUpperCase()).collect(Collectors.toList());
        System.out.println("the new list is :");
        System.out.println(s1);
        //for count() methodis used for counting with filters

        long count = al.stream().filter(I -> I.length() > 6).count();
        System.out.println("the count for the name greater the length 6 is  :");
        System.out.println(count);

        //for sorting in default 
        List<String> s2 = al.stream().sorted().collect(Collectors.toList());
        System.out.println("the sorted list is :");
        System.out.println(s2);

        //for customized sorting 
        List<String> s3 = al.stream().sorted((i1, i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());
        System.out.println("the sorted list is :");
        System.out.println(s3);
    }

}
