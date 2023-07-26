/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.hashing;

/**
 *
 * @author jigyasa_yadav
 */
import java.util.*;

public class HAshTAbleDEmo{
    public static void main(String[] args) 
    {
        Hashtable<Integer,String> ht=new Hashtable<>();
        
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        
        
        Enumeration e=ht.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        
        ht.computeIfAbsent(7, (k)->"Z"+k);

        System.out.println(ht);System.out.println(""+ht.remove(3));
        System.out.println(ht);
        
    }   
}
