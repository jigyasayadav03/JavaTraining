/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section20;

/**
 *
 * @author jigyasa_yadav
 */


import java.lang.*;


class MyObject
{ //this method is to print the object 
    public String toString()
    {
        return "My Object";
    }
    
    @Override
    public int hashCode()
    {
        return 100;
    }
    @Override
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
  //we cannot overrirde notify notifyAll and wait methods of object class
    //public void notify()
   // {
        
   // }
}
public class ObjectClassDemo {
    
    public static void main(String[] args) 
    {
        MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        System.out.println(o1);
        System.out.println(o1.hashCode());
        System.out.println(o1.equals(o2));
    }    
}