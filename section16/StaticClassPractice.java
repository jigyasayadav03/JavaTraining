/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section16;

/**
 *
 * @author jigyasa_yadav
 */
class Test1
{
    static int x=10;
    int y=20;
    
    void show()
    {
       System.out.println(x+" "+y);
    }
    
   static void display()
    {
       System.out.println(x);
    }
}

public class StaticClassPractice {

    public static void main(String[] args) {
        
        Test1 t1=new Test1();
        t1.show();
        Test1.x=30;
        t1.y=50; 
         
        Test1 t2=new Test1();
        t2.show();
        
    }
    
}
