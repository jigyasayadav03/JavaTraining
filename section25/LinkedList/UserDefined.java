/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.LinkedList;

/**
 *
 * @author jigyasa_yadav
 */
import java.util.*;

class Book {

    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;

        this.quantity = quantity;
    }
}

public class UserDefined {

    public static void main(String[] args) {

        List<Book> list = new LinkedList<Book>();
        //Creating Books  
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetka", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", 6);
   
        list.add(b1);
        list.add(b2);
        list.add(b3);
      
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + "  " + b.quantity);
        }
    }
}
