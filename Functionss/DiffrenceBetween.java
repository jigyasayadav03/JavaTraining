/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionss;

import java.util.function.Function;

/**
 *
 * @author jigyasa_yadav
 */
public class DiffrenceBetween {

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = s -> s + s;
        Function<Integer, Integer> f2 = s -> s * s * s;
        System.out.println(f1.apply(3));
        System.out.println("*************");
        System.out.println(f2.apply(3));
        System.out.println("************************");
        System.out.println("And then function use :");

        System.out.println(f2.andThen(f1).apply(3));
        System.out.println("******************");

        System.out.println("Compose function use :");
        System.out.println(f2.compose(f1).apply(3));
        System.out.println(f1.andThen(f2).apply(3));
        System.out.println("******************");

        System.out.println("Compose function use :");
        System.out.println(f1.compose(f2).apply(3));

    }
}
