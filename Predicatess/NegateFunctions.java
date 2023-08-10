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
public class NegateFunctions {


    public static void main(String[] args) {
        // Create a predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Create a new predicate that represents the negation of isEven
        Predicate<Integer> isOdd = isEven.negate();

        System.out.println("Is 5 even? " + isEven.test(5)); 
        System.out.println("Is 5 odd? " + isOdd.test(5));   
    }
}


