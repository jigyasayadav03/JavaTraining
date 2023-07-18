/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author jigyasa_yadav
 */

class StudentSerialize implements Serializable
{
    private int rollno;
   static  private String name;
  //static and transient cannot be deserialized 
    
    public StudentSerialize()
    {
        
    }
    public StudentSerialize(int r,String n)
    {
        rollno=r;
        name=n;
       
    }
    
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name ; 
                
    }
    
}

public class DeserializationUsingObjectInput {
    public static void main(String[] args) throws Exception {
         FileInputStream fis=new FileInputStream("/home/jigyasa_yadav/txtFiles/Student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
         StudentSerialize s=(StudentSerialize)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
       
        
    }
}

