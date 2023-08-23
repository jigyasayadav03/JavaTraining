/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.*;
import java.util.stream.Stream;

/**
 *
 * @author jigyasa_yadav
 */
public class MinimumValueAndMaxValueUSingStream {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(2);
        al.add(4);
        al.add(7);
        al.add(23);
        al.add(3);
        al.add(8);
        System.out.println("the array list is :" + al);
        //minimum value 
        Integer min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("minimum value is " + min);
        //maximum Value
        Integer max = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("maximum value is " + max);

        //toarray method
        Integer[] array = al.stream().toArray(Integer[]::new);
        for (Integer x : array) {
            System.out.print(" " + x);
        }
        Stream<Integer> s = Stream.of(3, 4, 5, 67, 7);
        s.forEach(System.out::println);
  Stream<Double> d= Stream.of(3.4, 4.4, 5.5, 6.6, 7.7);
        d.forEach(System.out::println);

    }
}
