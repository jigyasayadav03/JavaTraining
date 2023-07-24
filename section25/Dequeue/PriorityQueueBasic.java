/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.Dequeue;

import java.util.*;

/**
 *
 * @author jigyasa_yadav
 */
public class PriorityQueueBasic {

    public static void main(String[] args) {
        PriorityQueue<Integer> Pq = new PriorityQueue<>();
        Pq.add(2);
        System.out.println(Pq);
        Pq.add(10);
        System.out.println(Pq);
        Pq.add(5);
        System.out.println(Pq);
        Pq.add(4);
        System.out.println(Pq);
        Pq.remove();
        System.out.println(Pq);
        Pq.poll();
         Pq.add(0);
          //Pq.add(null);
        System.out.println(Pq);
        
    }
}
