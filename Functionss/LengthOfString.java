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
public class LengthOfString {
    public static void main(String[] args) {
        Function<String,Integer> f= s-> s.length();
        System.out.println(f.apply("jigyasa"));
        System.out.println(f.apply("Umesh   "));
    }
}
