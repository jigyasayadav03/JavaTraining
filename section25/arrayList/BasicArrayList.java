/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.arrayList;
import java.util.*;

/**
 *
 * @author jigyasa_yadav
 */
public class BasicArrayList {
    public static void main(String[] args) {
        List <Integer> l1= new ArrayList<Integer>(10);
        l1.add(1);
          l1.add(4);
        l1.add(3);
        l1.add(4);
        l1.add(1, 2);
          l1.add(4);
          System.out.println("size "+l1.size());
        System.out.println("elements are : "+ l1);
        System.out.println(l1.isEmpty());
        //returns a booleans value true if it is empty elsereturn false 
        System.out.println(l1.contains(3));
        //checks for the element if present returns true else return false 
        System.out.println(l1.hashCode());
        System.out.println(l1.lastIndexOf(4));
        System.out.println(l1.set(2, 5));
        
        
    
        System.out.println("for lop");
         for(int i=0;i<l1.size();i++)
            System.out.println(l1.get(i));
        
        for(Integer x:l1)
            System.out.println(x);
        System.out.println("iteraator");
        for(Iterator<Integer> it= l1.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }
        //for each 
        System.out.println("for each");
        l1.forEach((x)->{
            System.out.println(x);
        });
        
        for(Iterator<Integer> it=l1.listIterator();it.hasNext();)
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}
