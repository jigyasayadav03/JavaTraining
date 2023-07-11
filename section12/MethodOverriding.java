/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12;

/**
 *
 * @author jigyasa_yadav
 */
    class SuperClass{
      public static  void name(){
        System.out.println("i am super class name method"); 
    }
    void display(){
        System.out.println("i am super class area"); 
    }
}
class SubClass extends SuperClass{
   
            void search(){
                System.out.println("i am search method");
            }
             @Override
    void display(){
        System.out.println("i am sub class area"); 
    }
}
public class MethodOverriding {
    public static void main(String[] args) {  
        SuperClass su=new SuperClass();
    SuperClass su1=new SubClass();
 su1.display(); 
 su1.name();
}
}

