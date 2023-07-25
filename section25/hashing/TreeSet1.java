/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.hashing;

import java.util.*;

/**
 *
 * @author jigyasa_yadav
 */
public class TreeSet1 {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 55, 70, 10, 40));
    
        ts.add(25);
        System.out.println("floor value of 55 is :" + ts.floor(55));
        System.out.println("ceil value of 55 is :"
                + ts.ceiling(55));
        System.out.println(ts);
        System.out.println("" + ts.first());
        System.out.println("" + ts.higher(55));
    }
}
