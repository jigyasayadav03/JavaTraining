/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jigyasa_yadav
 */
public class CopyingOneListTOAnother {
    public static void main(String[] args) {
         List <Integer> l1= new ArrayList<Integer>(6);
        l1.add(1);
          l1.add(4);
        l1.add(3);
        l1.add(4);
        l1.add(1, 2);
          l1.add(4);
        List <Integer> l2=new ArrayList<>(l1);
        System.out.println("list 2 is " + l2);
    }
}
