/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdaFunctions;

/**
 *
 * @author jigyasa_yadav
 */
@FunctionalInterface
interface A {
public void hello();
//we can have static 
//public void h2();

public static  void h(){
    System.out.println("dfdfjmdfdf");
}
}
public class HelloWorld {
    
    public static void main(String[] args) {
        A a=()->{
            System.out.println("Hello");
        };
        a.hello();
        
}
}
