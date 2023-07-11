package section12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 *
 */
class Circle{
    public float  r;
    float pi=3.14f;
   void area(float radius){
       System.out.println("area is" +(pi*r*r) );   
   }
}
class Cylinder extends Circle{
    public float height;
    void area(){
        System.out.println("area is :"+(pi*r*r*height));
    }
}


public class Circle1 {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.r=2f;
        c1.height=4f;
        c1.area();
    }
}
