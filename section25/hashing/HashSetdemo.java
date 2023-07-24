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

public class HashSetdemo {

    public static void main(String[] args) {
       Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(null);
        s.add(0);
        s.add(13);
        s.add(13);
        System.out.println("set is :" + s);
        System.out.println("hash code is " + s.hashCode());
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        s.addAll(list2);
        s.addAll(list1);
        System.out.println("set after adding array List " + s);
        
       
    }
}
