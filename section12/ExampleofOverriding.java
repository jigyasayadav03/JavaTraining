/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12;

/**
 *
 * @author jigyasa_yadav
 */
class Car{
    
    void gear(){
        System.out.println("i am having 5 gears");
    }
    void run(){
        System.out.println("car runs");
    }
    void speed(){
        System.out.println("my speed is in between 50 to 200");
    }
    
    void openRoof(){
        System.out.println(" Having open roof depend on car models");
    }
}
class Honda extends Car{
    @Override
    void gear(){
        System.out.println("i am having 6 gears");
    }
   /*@Override
     void run(){
        System.out.println("honds car runs");
    }*/
    @Override
    void speed(){
        System.out.println("my speed is in between 50 to 250");
    }
    @Override
    void openRoof(){
        System.out.println(" Ihave a open roof");
    }
}
public class ExampleofOverriding {
    public static void main(String[] args) {
Car c= new Honda();
    c.gear();
    c.openRoof();
    c.speed();
c.run();
    }
}
