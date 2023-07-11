/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section16;

/**
 *
 * @author jigyasa_yadav
 */
final class Test {
    public final void show()
    {
        System.out.println();
    }
}

//class Test1 extends Test
//{
    //public void show(){}
    //gives error as final methods cannot be overloaded.
//}

public class FinalDemo {
    final static float PI=3.14f;
   
     final static int a=10;
    public static void main(String[] args) {
        System.out.println(PI);
    }
}
