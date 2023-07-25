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

public class HashMApDEmo1 {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
//do not maintain insertion order
//can have duplicate value and keys
        hm.put(5, "E");
        hm.put(1, "A");
        hm.put(4, "D");
        hm.put(2, "B");
        hm.put(5, "g");
        hm.put(3, "C");
        hm.put(6, "A");
        //maintains insertion oprder
        lhm.put(5, "E");
        lhm.put(1, "A");
        lhm.put(4, "D");
        lhm.put(2, "B");
        lhm.put(5, "k");
        lhm.put(3, "C");
        lhm.put(6, "A");

        System.out.println(hm);
        String s = lhm.get(5);
        lhm.put(4, "K");
        lhm.get(1);
        System.out.println(lhm);
    }
}
