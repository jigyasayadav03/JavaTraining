package Prc61_90;

import java.util.*;
import java.util.Map.Entry;

public class prc_80 {

    public static void main(String[] args) {

        LinkedHashMap<String, String> people = new LinkedHashMap<>();
        people.put("jigyasa", "indore");
        people.put("roshan", "ajmer");
        people.put("abhi", "manpur");

        Map<String, String> result = sortMap(people);

        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static LinkedHashMap<String, String> sortMap(LinkedHashMap<String, String> map) {
        List<Map.Entry<String, String>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Entry<String, String> o1, Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
