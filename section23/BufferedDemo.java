/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;

/**
 *
 * @author jigyasa_yadav
 */

import java.io.*;

public class BufferedDemo 
{
    public static void main(String[] args)throws Exception 
    {
        FileReader fis=new FileReader("/home/jigyasa_yadav/"
                + "FileWritingDemo.txt/");
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(5);
        System.out.print((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.println((char)bis.read());
        
        System.out.println("String "+bis.readLine());
        
        
    }    
}