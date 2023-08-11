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
public class AndThenFunction {

    public static void main(String[] args) {
        Function<String, String> f1 = s -> s.toUpperCase();
        Function<String, String> f2 = s -> {
            s.replace('a', 'k');
            s.replace('A', 'K');
            return s;
        };
        System.out.println(f1.apply("jigyasa"));
        System.out.println("*************");
        System.out.println(f2.apply("jigyasa"));
        System.out.println("************************");
        System.out.println("And then function use :");

        System.out.println(f2.andThen(f1).apply("jigyasa"));
        System.out.println("******************");

        System.out.println("Compose function use :");
        System.out.println(f2.compose(f1).apply("jigyasa"));
         System.out.println("******************");

        System.out.println(f1.andThen(f2).apply("jigyasa"));
        System.out.println("******************");

        System.out.println("Compose function use :");
        System.out.println(f1.compose(f2).apply("jigyasa"));

    }
}
