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

public class HashMap1 {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>(Map.of("A", 1, "B", 2, "C", 3, "D", 4));
        System.out.println(hm);
        hm.put("E", 5);
           hm.put("E", 2);
              hm.put(null, 5);
        System.out.println(hm);
        System.out.println(hm.containsKey("E"));
        System.out.println(hm.remove("E"));
        System.out.println(hm);
        System.out.println(hm.containsValue(5));
        System.out.println(hm.get("A"));//rturns the value of key specified
        System.out.println(hm.size());
        System.out.println(hm.entrySet());//printing the map
        //for iterating in diffrent ways
        Iterator it = hm.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.print(key + "->" + hm.get(key) + ",");
        }
        System.out.println("");
        for (String st : hm.keySet()) {
            System.out.print(st + " ");
        }
        System.out.println("");
        for (Integer i : hm.values()) {
            System.out.print(i + " ");
        }
      
        System.out.println("");
        for (String st : hm.keySet()) {
            System.out.print(hm.get(st) + " ");
        }
    }
}
