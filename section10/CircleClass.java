package section10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author jigyasa_yadav
 */
public class CircleClass {
float pi=3.14f;
float area(float x){
    return pi*x*x;
}
float perimeter(float y){
    return 2*pi*y;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        float radius =sc.nextFloat();
        CircleClass c1=new CircleClass();
        System.out.println("the area is :"+c1.area(radius));
         System.out.println("the perimeter is :"+c1.perimeter(radius));
    }
}
