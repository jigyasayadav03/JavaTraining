/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdaFunctions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author jigyasa_yadav
 */
public class Maplambda {
  
    public static void main(String[] args) {
        Comparator<Integer> customComparator = (i, i1) -> (i > i1) ? -1 : (i < i1) ? 1 : 0;
        TreeMap<Integer, String> tm = new TreeMap<>(customComparator);
        
        tm.put(1, "jigyasa");
        tm.put(5, "ayushi");
        tm.put(3, "roshan");
        tm.put(2, "abhigyan");
        tm.put(4, "harshit");
        
        System.out.println("BEFORE SORTING ");
        System.out.println(tm);
        System.out.println("AFTER SORTING");
    }
}
