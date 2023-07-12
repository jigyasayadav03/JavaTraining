/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section20;

/**
 *
 * @author jigyasa_yadav
 */
public class WrapperClass {
     public static void main(String[] args) {
        
      
        Integer a=Integer.valueOf("10");
        Integer b=10;
        
        Byte c=15;
        Byte d=Byte.valueOf("15");
        
        
        Short f=Short.valueOf("123");
        
        Float g=12.3f;

         System.out.println(g.isNaN());
        
        Double j=Double.valueOf(123.456);
        
        Character k=Character.valueOf('A');
        
        Boolean l=Boolean.valueOf("true");
        
        byte bb=15,cd=10;
        Byte e=Byte.valueOf(cd);
         System.out.println(e.compareTo(bb));
        Float h=Float.valueOf("123.5");
        float x=h.floatValue();
        float y=h;
        
        int m=10;
    //auto boxing
        Integer n=Integer.valueOf(m);
        //Integer n=m;
        //auto unboxing 
        int p=n.intValue();
        //int p=n;
         System.out.println(p);
}
}