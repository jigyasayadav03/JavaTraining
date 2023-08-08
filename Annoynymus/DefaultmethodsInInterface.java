/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Annoynymus;

/**
 *
 * @author jigyasa_yadav
 */
interface Intr{
    default void r(){
        System.out.println("default ");
    }
}
       
public class DefaultmethodsInInterface implements Intr {
    public void r(){
        System.out.println("overriden method");
    }
    public static void main(String[] args) {
        DefaultmethodsInInterface d=new DefaultmethodsInInterface();
        d.r();
    }
}
