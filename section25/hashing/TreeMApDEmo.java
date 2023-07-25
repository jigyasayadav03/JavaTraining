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
public class TreeMApDEmo {

    public static void main(String[] args) {
        TreeMap<String, Integer> Tm = new TreeMap<>();
        Tm.put("A", 1);
        Tm.put("B", 4);
        Tm.put("C", 3);
        Tm.put("E", 2);
        Tm.put("F", 7);
        Tm.put("D", 2);
//no null keys         Tm.put(null, 5);
           Tm.put("E", 5);
        System.out.println("the map is " + Tm);
        System.out.println("the key is" + Tm.keySet());
        System.out.println("the value is " + Tm.get("A"));
        System.out.println("the value is " + Tm.get("C"));
  
        System.out.println(Tm);
        Iterator it=Tm.keySet().iterator();
        while(it.hasNext()){
            String key=(String)it.next();
            System.out.print(key+"->"+Tm.get(key)+" ");
        }
        System.out.println("");
        for(Map.Entry<String,Integer> en:Tm.entrySet()){
            System.out.print(en.getKey()+"->"+en.getValue()+" ");
        }
    }
    }


