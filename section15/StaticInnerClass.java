/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section15;

/**
 *
 * @author jigyasa_yadav
 */
class Outer1{
    int a=10;
    static int b=20;
    static class Inner1{
        int k=10;
        void display(){
       System.out.println(k);
            System.out.println(b);
    }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer1.Inner1 i=new Outer1.Inner1();
        System.out.println(i.k); 
    }
}
