/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

/**
 *
 * @author jigyasa_yadav
 */
public class CopyingFile {
   //writing all the characters in small letter



    public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis1=new FileInputStream("/home/jigyasa_yadav/"
                + "FileWritingDemo.txt/");
       
        
        FileOutputStream fos=new FileOutputStream("/home/jigyasa_yadav/"
                + "CopiedFile.txt/");
                
        
        
        
        int b;
        while((b=fis1.read())!=-1)
        {
            if(b>=65 && b<=90)fos.write(b+32);
           else fos.write(b);
        }
       
        fis1.close();
       
        fos.close();
        
    }   
}