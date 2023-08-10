/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicatess;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
/**
 *
 * @author jigyasa_yadav
 */
public class StringsLEngth {
    public static void main(String[] args) {
        Predicate <String> p= a->  a.length()>20;
        System.out.println(p.test("jigyasa"));
     
    }

}
