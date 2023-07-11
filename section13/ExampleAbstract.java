/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section13;

/**
 *
 * @author jigyasa_yadav
 */
abstract class Shape{
    final static int COUNT=0;
    abstract void perimeter(float x, float y);
    abstract void area(float x, float y);
    static void a(){
        System.out.println("hello");
    }
} 
class Rect extends Shape{
   @Override
   void perimeter (float x, float y){
       System.out.println("perimeter of rectangle is " + (2*(x+y)));
   } 
   @Override
   void area(float x , float y){
       System.out.println("the area of rectangle is "+ (x*y));
   }
}



public class ExampleAbstract {
    public static void main(String[] args) {
    Rect ec= new Rect();
        ec.perimeter(10,12);
        ec.area(2,4);
    ec.a();
}}

