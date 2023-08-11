/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionss;
import java.util.function.Function;
/**
 *
 * @author jigyasa_yadav
 */
public class RemoveSpacesWithinTheStrings {
    public static void main(String[] args) {
        Function <String, String> f= s-> s.replaceAll(" ","");
        String s="Hello my name is JIGYASA YADAV ";
        System.out.println("the removed space string is : "+ f.apply(s));
        System.out.println("******************************************");
     Function <String, Integer> f1= j-> j.length()- j.replaceAll(" ","").length();
   
        System.out.println("the number of space in the string is  : "+ f1.apply(s));
    }
}
