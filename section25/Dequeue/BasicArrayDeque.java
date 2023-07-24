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
public class BasicArrayDeque {
    public static void main(String[] args) {
        Deque <Integer> Ad=new ArrayDeque<>(List.of(1,2,3,4,5,5/*,null*/));
       
        System.out.println(Ad.pollFirst());
          System.out.println(Ad.pollLast());
            System.out.println(Ad.offer(6));
        System.out.println(Ad);
        System.out.println(Ad.peekFirst());
       
    }
    }

