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

public class LinkedHAshSet {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");// no duplicates 
        lhs.add("B");

        Iterator<String> itr = lhs.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Hashtable ht = new Hashtable(10);

    }
}
