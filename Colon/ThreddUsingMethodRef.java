/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colon;
public class ThreddUsingMethodRef {
    public void m1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args) {
       ThreddUsingMethodRef t = new ThreddUsingMethodRef();
        Runnable r = t::m1;
        //m1 is the instance method present inside public  class
        Thread t1 = new Thread(r );
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("MAin Thread");
        }
    }
}
