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
public class ArrayListToLinkedList {
    public static void main(String[] args) {
        List<Integer>i =new ArrayList<>(List.of(1,2,3,4));
        LinkedList <Integer> l1=new LinkedList<>();
        l1.addAll(i);
        System.out.println("linked List: "+ l1);
        System.out.println("array list "+i);
    }
}
