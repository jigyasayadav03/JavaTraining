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
         // first we make the object of FileWriter class  
        FileWriter fw = new FileWriter("/home/jigyasa_yadav/txtFiles/FileDemoPrac1.txt");  
        //this is a string and using write in "abhishek.txt" file  
        String s = "this program is with file writer class ";  
  
        // toCharArray() is method to convert a string in a character array  
        char ch[] = s.toCharArray();  
        for (int i = 0; i < ch.length; i++)  
            fw.write(ch[i]);  
        fw.close();  
    }  
}