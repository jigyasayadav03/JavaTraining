/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.hashing;

/**
 *
 * @author jigyasa_yadav
 */
import java.util.*;
import java.io.*;

public class PUliingFromFile {

    public static void main(String[] args) throws Exception
    {
        // File path must be valid
        FileInputStream fis=new FileInputStream("/home/jigyasa_yadav/txtFiles/mydata.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        
        String data=new String(b);

        //String data="name=Vijay address=delhi country=india dept=cse";
    
        
        StringTokenizer stk=new StringTokenizer(data,"= ");
        
        String s;
        ArrayList<String> al=new ArrayList<>();
        
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(s);
            
        }
        
        System.out.println(al);

    }
    
}