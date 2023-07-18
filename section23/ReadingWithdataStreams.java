/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author jigyasa_yadav
 */
class Student1
{
    int rollno;
    String name;
    String dept;
}
public class ReadingWithdataStreams {
    public static void main(String[] args) throws Exception{
        //reading from file
        FileInputStream fis=new FileInputStream("/home/jigyasa_yadav/txtFiles/DataInputStream.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        Student1 s=new Student1();
        
        s.rollno=dis.readInt();
        
        s.name=dis.readUTF();
        
        s.dept=dis.readUTF();
      
        
        System.out.println("Roll no "+s.rollno);
        System.out.println("Name "+s.name);
        System.out.println("Dept "+s.dept);
        
        
        dis.close();
        fis.close();
    }
}
