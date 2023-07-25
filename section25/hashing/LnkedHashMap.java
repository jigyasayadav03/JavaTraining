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

public class LnkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5) {

            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 5;
            }
        };
 lhm.put(5, "E");
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
       
        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(1);
        lhm.put(6, "F");
 lhm.put(7, "G");
 lhm.put(8, "h");

        System.out.println("map is "+ lhm);

    }
}
