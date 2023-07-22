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
public class LinkedListToGetTheFirstElement {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(//List.of(40, 20, 74, 45, 56, 47, 22)
                );
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            l1.add(sc.nextInt());
        }
        System.out.println("the first element: " + l1.peekFirst());
    }
}
