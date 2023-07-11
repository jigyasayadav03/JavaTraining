/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19;

/**
 *
 * @author jigyasa_yadav
 */ class MyClass1 implements Runnable{
     @Override
     public void run(){
         int i=1;
        while(true){
            System.out.println("hello"+i);
            i++;
        }
     }
 }
public class UsingInterface {
    public static void main(String[] args) {
        MyClass1 m=new MyClass1();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(true){
            System.out.println("jigyasa"+i);
            i++;
        }
    }
}
