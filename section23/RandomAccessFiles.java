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

public class RandomAccessFiles {

    public static void main(String[] args) throws Exception {
        RandomAccessFile rf = new RandomAccessFile("/home/jigyasa_yadav/txtFiles/CharArrayFile.txt", "rw");
        //byte b[]={'A','B','C','D','E','F','G''H','I','J'};
        System.out.println("" + rf.getFilePointer());
        System.out.println((char) rf.read());
        System.out.println((char) rf.read());
        System.out.println("" + rf.getFilePointer());
        rf.write('C');
        System.out.println("" + rf.getFilePointer());
        System.out.println((char) rf.read());
        System.out.println("" + rf.getFilePointer());
        //reads d
        rf.skipBytes(4);
        //skips 4 byte til h
        System.out.println((char) rf.read());
        //reads i
        rf.seek(2);
        //System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer() + 4);
        System.out.println((char) rf.read());

    }
}
