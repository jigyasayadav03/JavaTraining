/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package section23;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author jigyasa_yadav
 */
class Student
{
    int rollno;
    String name;
    String dept;
}
public class PrintingThroughPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream p=new PrintStream("/home/jigyasa_yadav/txtFiles/PrintStream.txt");
            p.println("Hello");
         
             Student s=new Student();
        s.rollno=10;
        s.name="JIGYASA";
        s.dept="CSE";
        
        p.println(s.rollno);
        p.println(s.name);
        p.println(s.dept);
        
        p.close();
        System.out.println("roll no is"+s.rollno);
    
    }
}
