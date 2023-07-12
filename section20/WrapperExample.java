/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section20;

/**
 *
 * @author jigyasa_yadav
 */
 public class WrapperExample {
     static Integer changeValue(Integer i){
         i=200;
         System.out.println(i);
         return i;
     }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before change: " + number);
        
        Integer wrapper = new Integer(number);
       Integer c = changeValue(wrapper);
        System.out.println(c);
    }
    
 }

   