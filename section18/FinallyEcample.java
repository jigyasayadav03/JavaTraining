/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;

/**
 *
 * @author jigyasa_yadav
 */
public class FinallyEcample {
    public static void main(String[] args) {
      
        try{
            try{
           int a=10;
       
        int b=0;
        int c= a/b;
        
        System.out.println(c);
        
   }
   
       finally
               {
    System.out.println("hello");
               }
        }
      catch(Exception e){
        System.out.println("aithmetic exception ");
    }
}
}
