/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section15;

/**
 *
 * @author jigyasa_yadav
 */
interface OOOOps{
    public void product();
}
abstract class Oops{
    static int a=10;
    public static void add(int x){
        System.out.println(""+(a+x));
    }
    public  void add(float x){
        System.out.println(""+(x+a));
    }
}
class Oops2 extends Oops implements OOOOps{
    @Override
    public void add(float x){
        System.out.println("method overrided");
         System.out.println(""+(x+a));
    }   
    @Override
    public void product(){
        System.out.println("square of a is "+(a*a));
    }
}
public class ImplementingOOPS {
    public static void main(String[] args) {
        Oops.add(12);
        Oops2 a=new Oops2();
        a.add(23f);
        a.product();
    }
}
