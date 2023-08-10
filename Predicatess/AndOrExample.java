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
public class AndOrExample {
    


    public static void main(String[] args) {
     
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isGreaterThan5 = number -> number > 5;
 Predicate<Integer> isEvenAndGreaterThan5 = isEven.and(isGreaterThan5);

        
        Predicate<Integer> isEvenOrGreaterThan5 = isEven.or(isGreaterThan5);

        // Test the combined predicates
        System.out.println("Is 6 even and greater than 5? " + isEvenAndGreaterThan5.test(6)); 
        System.out.println("Is 3 even and greater than 5? " + isEvenAndGreaterThan5.test(3)); 

        System.out.println("Is 6 even or greater than 5? " + isEvenOrGreaterThan5.test(6));   
        System.out.println("Is 3 even or greater than 5? " + isEvenOrGreaterThan5.test(3));  
        System.out.println("Is 2 even or greater than 5? " + isEvenOrGreaterThan5.test(2));   
    }
}
