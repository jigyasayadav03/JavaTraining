/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colon;

/**
 *
 * @author jigyasa_yadav
 */
interface Interff{
    public void m1();
    
    
}
public class StaticMethodRefernce {
    public static void add(){
        System.out.println("the sum is given by adding two number");
    }
    public static void main(String[] args) {
       Interff i=StaticMethodRefernce::add;
       i.m1();
       
       
    }
}
