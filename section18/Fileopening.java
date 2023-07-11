/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;
import java.io.*;
import java.util.*;
/**
 *
 * @author jigyasa_yadav
 */
public class Fileopening {
   
    static void Divide() throws Exception
    {
        try(  
                FileInputStream fi=new FileInputStream("/home/jigyasa_yadav/NetBeansProjects/myfirstprject/src/main/java/section18/Exp.txt"
                );
                Scanner sc=new Scanner(fi) )
        {
        int a=5;
        int b=2;
        System.out.println(a/b);
        }
    }
    public static void main(String[] args) throws Exception
    {
        try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
    }
    
}
