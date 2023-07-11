/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section15;

/**
 *
 * @author jigyasa_yadav
 */
class Outer
{
    static int x=10;
    Inner i=new Inner();//iner classs object 
    
    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);//access member of outer class
        }
    }
    
    public void outerDisplay()
    {
        
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}

public class NestedInner {

    public static void main(String[] args) 
    {
        
        Outer.Inner oi=new Outer().new Inner();
        
        oi.innerDisplay();
        
    }
    
}
