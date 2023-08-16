/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supplier;
import java.util.Date;
import java.util.function.Supplier;
/**
 *
 * @author jigyasa_yadav
 */
public class SystemDate {
    public static void main(String[] args) {
        
    
Supplier<Date> s= ()->  new Date();
        System.out.println("the date is : "+ s.get());
    }
   
}
