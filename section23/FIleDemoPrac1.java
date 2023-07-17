/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jigyasa_yadav
 */
public class FIleDemoPrac1 {

    public static void main(String[] args) throws IOException {
        /*
        FileWriter fw = new FileWriter("/home/jigyasa_yadav/txtFiles/FileDemoPrac1.txt");  
          
        String s = "this program is with file writer class ";  
  
        char ch[] = s.toCharArray();  
        for (int i = 0; i < ch.length; i++)  
            fw.write(ch[i]);  
        fw.close();  
         */
        //char c[]=s.toCharArray();
        FileReader fis = new FileReader("/home/jigyasa_yadav/txtFiles/"
                + "FileDemoPrac1.txt/");

        int x;

        while ((x = fis.read()) != -1) {
            System.out.print((char) x);

        }

        fis.close();

    }
}
    /* FileWriter fw = new FileWriter("/home/jigyasa_yadav/txtFiles/FileDemoPrac1.txt");  
          
        String s = "This program is with file writer class ";  
  
        char ch[] = s.toCharArray();  
        for (int i = 0; i < ch.length; i++)  
            fw.write(ch[i]);  
        fw.close(); 
        
      try{    
            try (FileInputStream fin = new FileInputStream("/home/jigyasa_yadav/txtFiles/"
                    + "FileDemoPrac1.txt/")) {
                int i=0;
                while((i=fin.read())!=-1){
                    System.out.print((char)i);
                }
            }    
          }catch(IOException e){System.out.println(e);}   
         }    
    }  
*/
