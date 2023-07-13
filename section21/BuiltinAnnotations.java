/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section21;

/**
 *
 * @author jigyasa_yadav
 */

class A
{
    public void display()
    {
        
    }
}

class B extends A
{
    @Override
    public void display()
    {
        
    }
    @Deprecated
    public void show()
    {
        
    }
    
}

public class BuiltinAnnotations 
{
    
    public static void main(String[] args) 
    {
        int a;
        @SuppressWarnings("deprecation")

        B b=new B();
  
        b.show();
    }
    
}