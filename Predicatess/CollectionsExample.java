/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicatess;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author jigyasa_yadav
 */
public class CollectionsExample {
    public static void main(String[] args) {
        
    
     Predicate<List<Integer>> c = l -> l.isEmpty();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        System.out.println(c.test(l1));
}

}