package Annoynymus;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */
interface Intref{
    public void run();
    
}
class T{
    int y=99;//instance variable 
     public void run1(){
 int x=10;
 //local variable
    
    
    Intref i=()->{
            System.out.println(x);
            //x=30;//local variable refrence from lambda expn are final
         System.out.println(y);
         y=77;
        };
     i.run();
     }
}

public class Annoynymus2 {
    public static void main(String[] args) {
        T t=new T();
        t.run1();
        
    }
}
