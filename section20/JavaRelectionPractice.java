/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section20;

/**
 *
 * @author jigyasa_yadav
 */


import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    
    public My() {}
    
    public My(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
    
}

public class JavaRelectionPractice {
    


    public static void main(String[] args) 
    {
        Class c=My.class;
        System.out.println("the name of class is :"+c.getName());
        System.out.println("the name of package is :"+c.getPackageName());
        Field field[]=c.getDeclaredFields();
        for(Field f:field)
            System.out.println(f);
        
        Method meth[]=c.getMethods();
                for(Method m:meth)
            System.out.println(m);
        
        Parameter param[]=meth[0].getParameters();
        
        for(Parameter p:param)
        {
            System.out.println("  "+p.getName()+" "+p);
        }
        
    }   
}


