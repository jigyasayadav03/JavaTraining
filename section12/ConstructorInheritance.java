package section12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */

    class Parent{
    Parent(){
        System.out.println("parent contructor");
    }
    void initialize(){
        System.out.println("hey i am parent");
}
}
class Child extends Parent{
    void initializ(){
        System.out.println("hey i am child");
}
    public Child(){
        System.out.println("child constructor");  
    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
        Child c =new Child();
       Parent p=new Child();
            Parent p1=new Parent();
       c.initializ();
       p.initialize();
       p1.initialize();
    
    }
}
