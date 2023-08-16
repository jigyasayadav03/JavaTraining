/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supplier;
import java.util.function.Supplier;
/**
 *
 * @author jigyasa_yadav
 */
public class RandomName {
    public static void main(String[] args) {
        Supplier <String> s= ()->
        {
            String []a={
                "jigyasa","khushi","vinay","kruti","vishal"};
            int x = (int)(Math.random()*4);
            return a[x];
            
        };
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
