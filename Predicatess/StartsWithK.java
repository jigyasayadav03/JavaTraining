/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicatess;
import java.util.function.Predicate;

/**
 *
 * @author jigyasa_yadav
 */
public class StartsWithK {
    public static void main(String[] args) {
        Predicate <String> p=(s)-> s.charAt(0)=='k';
        String [] name= {"khushi", "jigyasa", "kreya", "sarika",  "kunal"};
        for(String k : name){
            if(p.test(k)){
                System.out.println(k);
            }
        }
    }
    
}
