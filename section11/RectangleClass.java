package section11;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author jigyasa_yadav
 */
public class RectangleClass {

float area(float x,float y){
    return x*y;
}
float perimeter(float x,float y){
    return 2*(x+y);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length: ");
        float length =sc.nextFloat();
        
        System.out.println("enter the Breadth: ");
        float Breadth =sc.nextFloat();
        RectangleClass r1=new RectangleClass();
        System.out.println("the area is :"+r1.area(length, Breadth));
         System.out.println("the perimeter is :"+r1.perimeter(length, Breadth));
    }
}    

