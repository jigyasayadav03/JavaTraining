/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;
import java.util.*;
/**
 *
 * @author jigyasa_yadav
 */
public class MultipleTryCatch {
    public static void main(String[] args) 
    {
       
           try{    
                int a[]=new int[5];    
                a[5]=30/0;    
               }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");       
        System.out.println("Bye");
    }
}








