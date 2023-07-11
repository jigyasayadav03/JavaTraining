package section10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */
public class Construct {
    Construct(){
        System.out.println("this is a constructor");
    }
    Construct(int a){
        this();
        int s=a+10;
        System.out.println("this is a value of " +s);
    }
    public static void main(String[] args) {
        Construct c= new Construct(10);
        
    }
}
