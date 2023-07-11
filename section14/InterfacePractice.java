/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section14;

/**
 *
 * @author jigyasa_yadav
 */
interface A{
    int T=16;
    public void show();
    public void display();
}
class B implements A{
   @Override
   public void show(){
       System.out.println("hello");
   } 
   public void display(){
       System.out.println( "display method"); 
   }
}
public class InterfacePractice {
    public static void main(String[] args) {
        System.out.println(""+A.T);
    
    A b=new B();
    b.display();
}
}
