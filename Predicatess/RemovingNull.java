/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicatess;
import java.util.ArrayList;
import java.util.function.Predicate;
/**
 *
 * @author jigyasa_yadav
 */
public class RemovingNull {
    public static void main(String[] args) {
        Predicate <String> p=(s)-> s!=null &&s.length()!=0;
        ArrayList< String> al=new ArrayList<>();
       String[] names= {"jigyasa","","khushi","kavita","jaya","", null};
       for(String s: names){
           if(p.test(s)){
               al.add(s);
           }
       }
              System.out.println(al);
                
    }
}
