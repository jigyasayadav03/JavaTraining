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

    




public class FileDemo {

    public static void main(String[] args) throws Exception {

        try (FileOutputStream fos = new FileOutputStream("/home/jigyasa_yadav/"
                + "FileWritingDemo.txt/");) {

            String str = "Hello!, Jigyasa Yadav Here .";

            byte b[] = str.getBytes();

            fos.write(b);

            fos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
         try{    
            try (FileInputStream fin = new FileInputStream("/home/jigyasa_yadav/"
                    + "FileWritingDemo.txt/")) {
                int i=0;
                while((i=fin.read())!=-1){
                    System.out.print((char)i);
                }
            }    
          }catch(IOException e){System.out.println(e);}   
         }    
        }  
    


