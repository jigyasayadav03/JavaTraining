/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.LinkedList;

import java.util.*;

/**
 *
 * @author jigyasa_yadav
 */
public class LinkedListBasics {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(List.of(19, 29, 39, 49, 59));
        System.out.println("size is :" + l1.size());
        System.out.println("contains 39 :" + l1.contains(39));
        System.out.println("contains 79 :" + l1.contains(79));
        System.out.println("add :" + l1.add(79));
        System.out.println("contains 79 :" + l1.contains(79));
        System.out.println("set a element  " + l1.set(3, 45));
        System.out.println("linked list " + l1);
        System.out.println("first elemt" + l1.peek());
        System.out.println("last elemt" + l1.peekLast());
        System.out.println("For loop iteration ");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ,");
        }
        System.out.println(" ");
        System.out.println("remove last elemt" + l1.pollLast());
        System.out.println(" ");
        System.out.println("For iterator ");
        for (Iterator<Integer> it = l1.iterator(); it.hasNext();) {
            java.lang.Integer x = it.next();
            System.out.print(x + ",");
        }

    }

}
