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
public class LeapYearChecker {
    public static void main(String[] args) {
        Predicate <Integer> p= (y)-> {if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                   return true; 
                }
            }
        }
            return false;
        };
        System.out.println(p.test(1800));
        
    }
}
