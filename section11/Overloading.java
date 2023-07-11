package section11;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */
public class Overloading {
   static void sum(int x,int y){
        System.out.println("sum is "+(x+y));
    }
    
    static void sum(float x,int y){
        System.out.println("sum is "+(x+y));
    }
    static void sum(float x,float  y){
        System.out.println("sum is "+(x+y));
    }
   
    
    
    public static void main(String[] args) {       
int a=10;
int b=20;
float c=10f;
float d=30f;
    sum(a,b);
    sum(c,d);
    sum(c,a);
   
    
    }
}
