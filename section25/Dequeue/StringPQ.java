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
public class StringPQ {
    public static void main(String[] args) {
         PriorityQueue <String> Ad=new PriorityQueue<>(List.of("jigyasa", "hii","hello","hire"));
        System.out.println(Ad);
      
       Ad.remove();
        System.out.println(Ad);
        
       Ad.toString();
        System.out.println(Ad);
        
    }
    }
    

