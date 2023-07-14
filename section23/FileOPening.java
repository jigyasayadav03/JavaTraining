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
public class FileOPening {
    
      
	public static void main(String[] args)
	{

		String text
			= "Hello!,  jigyasa yadav ";

		
		try {

			
			FileWriter fWriter = new FileWriter(
				"/home/jigyasa_yadav/FileWritingDemo.txt/");

			
			fWriter.write(text);

			
			System.out.println(text);

			
			fWriter.close();

			System.out.println(
				"File is created successfully with the content.");
		}

		
		catch (IOException e) {

			
			System.out.print(e.getMessage());
		}
	}

}
