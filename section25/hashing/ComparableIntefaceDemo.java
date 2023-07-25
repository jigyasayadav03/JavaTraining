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

class Stud implements Comparable<Stud> {

    String name;

    int std;

    public Stud(String name, int std) {
        super();
        this.name = name;
        this.std = std;
    }

    @Override
    public String toString() {
        return " name =" + name + " , " + " class = " + std;
    }

    public int compareTo(Stud t) {
        return std > t.std ? 1 : -1;
    }

}

public class ComparableIntefaceDemo {

    public static void main(String[] args) {

        List<Stud> ts = new ArrayList<>();
        ts.add(new Stud("jigyasa", 5));
        ts.add(new Stud("riya", 3));

        ts.add(new Stud("priya", 6));
        Collections.sort(ts);
        System.out.println(ts);
    }

}
