/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoArgument;
import java.util.function.BiFunction;

/**
 *
 * @author jigyasa_yadav
 */
public class ReturningProduct {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> f=(a,b)-> a*b;
        System.out.println("the prduct is "+ f.apply(10,2));
            System.out.println("the prduct is "+ f.apply(4,2));}
}
