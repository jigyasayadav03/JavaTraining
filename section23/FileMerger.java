/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jigyasa_yadav
 */
public class FileMerger {

    public static void main(String[] args) throws IOException {
        mergeFiles("home/jigyasa_yadav/"
                + "FileWritingDemo.txt/", "/home/jigyasa_yadav/"
                + "FileDemoPrac1.txt/", "/home/jigyasa_yadav/"
                + "mergedFile.txt");
    }

    public static void mergeFiles(String file1, String file2, String mergedFile) throws FileNotFoundException, IOException {
         BufferedReader reader1 = new BufferedReader(new FileReader("/home/jigyasa_yadav/"
                + "FileWritingDemo.txt/"));
             BufferedReader reader2 = new BufferedReader(new FileReader("/home/jigyasa_yadav/"
                + "FileDemoPrac1.txt/"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("/home/jigyasa_yadav/"
                + "mergedFile.txt")) ;

            String line;

            // Read from file1 and write to mergedFile
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Read from file2 and write to mergedFile
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully!");
        
                     }
}

