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
import java.io.FileOutputStream;
import java.io.*;

public class CharArrayWriter {

    public static void main(String[] args) throws Exception
    {
        
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        
        CharArrayReader cr=new CharArrayReader(c);
        FileOutputStream fos=new FileOutputStream("/home/jigyasa_yadav/"
                + "CharArrayFile.txt/");
        int x;
        
        while((x=cr.read())!=-1)
        {
            int i= ((char)x);
            fos.write(i);
            System.out.println("");
        }
        
        cr.close();
        
    }
}
