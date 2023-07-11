/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section15;

/**
 *
 * @author jigyasa_yadav
 */
class Outer2
{
    int x=10;
    static int y=20;
    
    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    }
    
    
}

public class Practice 
{
    public static void main(String[] args) 
    {
        Outer2.My m=new Outer2.My();
        m.show();

    }
    
}
