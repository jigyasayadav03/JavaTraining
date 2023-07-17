/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jigyasa_yadav
 */
public class AddTextToExisting {
    
    public static void append(String msg,String Filename){
        try {
            FileWriter fw=new FileWriter( Filename, true);
         String k= "/n";
            fw.write(msg);
            fw.write(k);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AddTextToExisting.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String fileName="/home/jigyasa_yadav/txtFiles/CopiedFile.txt";
        System.out.println("Please enter the text you want to print:");
        String fileContent= sc.nextLine();
        append(fileContent, fileName);
    }
  
}
