/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;
import java.io.*;
/**
 *
 * @author jigyasa_yadav
 */
public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f=new File("/home/jigyasa_yadav");
         //System.out.println(f.isDirectory());
       File list[]=f.listFiles();
        
       for(File x:list)
       {
           System.out.println(x.getCanonicalPath());
           System.out.println(x.getParent()+" "+x.getName());
       }
      
    }
}
    

