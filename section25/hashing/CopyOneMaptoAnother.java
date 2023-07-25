/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jigyasa_yadav
 */
public class CopyOneMaptoAnother {
//using the put all method

    public static <K, V> Map<K, V>
            putall(Map<K, V> original) {
        Map<K, V> Second_Map = new HashMap<>();
        Second_Map.putAll(original);
        return Second_Map;
    }
//<K and V are the generic type parameters

    public static <K, V> Map<K, V>
            copyMap(Map<K, V> original) {
        Map<K, V> second_Map = new HashMap<>();
        for (Map.Entry<K, V> entry : original.entrySet()) {
            // using put method to copy one Map to Other
            second_Map.put(entry.getKey(),
                    entry.getValue());
        }
        return second_Map;
    }

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        // hashMap to second_Map
        Map<String, Integer> second_Map = copyMap(hashMap);
        System.out.println(second_Map);
        Map<String, Integer> Second_Map = putall(hashMap);
        System.out.println(Second_Map);
    }
}
