/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoArgument;
import java.util.function.BiPredicate;
/**
 *
 * @author jigyasa_yadav
 */
public class SumBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bi=(a,b)->
                (a+b)%2==0;
        System.out.println("is the sum even ??  "+bi.test(3,3));
         System.out.println("is the sum even ??  "+bi.test(2,3));
    }
}
