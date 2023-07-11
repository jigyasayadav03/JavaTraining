/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section13;

/**
 *
 * @author jigyasa_yadav
 */
abstract class Super
{
    void method3(){
        System.out.println("HELLO ");
    }
    abstract void method1();
        void show(){
            System.out.println("hello!!");
        }
    
}
class Sub extends Super{
    @Override
    void method1(){
        System.out.println("i am sub class");
    }
}
   
public class AbstractClass {
    public static void main(String[] args) {
        Sub s=new Sub();
        s.method1();
       Super t;
       s.method3();
        
    }
}
