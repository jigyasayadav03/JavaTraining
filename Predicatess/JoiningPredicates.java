/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicatess;

import java.util.function.Predicate;

/**
 *
 * @author jigyasa_yadav
 */
import java.util.function.Predicate;

public class JoiningPredicates {

    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;

        System.out.println("The Numbers Greater Than 10:");
        m1(p1, x);

        System.out.println("The Even Numbers Are:");
        m1(p2, x);

        System.out.println("The Numbers Not Greater Than 10:");
        m1(p1.negate(), x);

        System.out.println("The Numbers Greater Than 10 And Even Are:");
        m1(p1.and(p2), x);

        System.out.println("The Numbers Greater Than 10 OR Even:");
        m1(p1.or(p2), x);
    }

    public static void m1(Predicate<Integer> predicate, int[] arr) {
        for (int num : arr) {
            if (predicate.test(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
