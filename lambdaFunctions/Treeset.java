/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdaFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author jigyasa_yadav
 */
/**
 *
 * @author jigyasa_yadav
 */
/*class myComparator implements Comparator<Integer>{
    
    @Override
    public int compare(Integer t,  Integer t1) {
      /*  if(t>t1){
            return -1;
        }
        else 
            if(t<t1) {
                return 1;
            }
            else 
                return 0;
             }
      return (t>t1)?-1:(t<t1)?1:0;
    }
}*/
public class Treeset {

    public static void main(String[] args) {
        TreeSet<Integer> l = new TreeSet<>((t, t1) -> (t > t1) ? -1 : (t < t1) ? 1 : 0);
        l.add(10);
        l.add(8);
        l.add(20);
        l.add(2);
        l.add(20);
        l.add(5);
        l.add(7);
        System.out.println("before soring");
        System.out.println(l);
        System.out.println("AFTER SORTING");

        System.out.println(l);
    }
}
