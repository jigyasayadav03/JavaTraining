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

public class ListSerialized{
    public static void main(String[] args) throws Exception
    {
        float list[]={1.0f , 3.455f , 4.25f , 7.21f , 6.34f};
        
        FileOutputStream fos=new FileOutputStream("/home/jigyasa_yadav/txtFiles/List.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        dos.writeInt(list.length);
        for(float f:list)
        {
            dos.writeFloat(f);
        }
        
        dos.close();
        fos.close();
        
        FileInputStream fis=new FileInputStream("/home/jigyasa_yadav/txtFiles/List.txt");
        DataInputStream dis=new DataInputStream(fis);
        int length=dis.readInt();
        float data;
        
        for(int i=0;i<length;i++)
        {
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
        
    }   
}
