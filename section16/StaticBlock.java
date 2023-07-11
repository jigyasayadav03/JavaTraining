/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section16;

/**
 *
 * @author jigyasa_yadav
 */

public class StaticBlock {
    static int j=10;
    int k=30;
   static void show(){
    
    System.out.println("hello I am non static ");
}
static{
    j=j*10;
    System.out.println("hello static 1: "+j);
}  
void display(){
    
    System.out.println("hello I am non static ");
}
    public static void main(String[] args) {
        System.out.println("main");
        StaticBlock s=new StaticBlock();
        s.display();
     s.show();
     StaticBlock.show();
    }
}
