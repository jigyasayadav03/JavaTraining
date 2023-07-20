/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24;

/**
 *
 * @author jigyasa_yadav
 */
public class Generics2<T>
{
    T data[]= (T[])new Object[3];
    
    public static void main(String[] args) {
        Generics2<String>g1= new Generics2();
        g1.data[0]="hii";
        g1.data[1]="0";
        g1.data[2]="hlo";
        String s=g1.data[0];
        
    }
}
