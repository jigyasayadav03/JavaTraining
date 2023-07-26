/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.hashing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author jigyasa_yadav
 */
public class PropertiesDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Properties p = new Properties();

        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");

        p.store(new FileOutputStream("/home/jigyasa_yadav/txtFiles/mydata.txt"),
                "Laptop");

        
        System.out.println(p);
    }
}
