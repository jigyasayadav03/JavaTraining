/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author jigyasa_yadav
 */
public class INsertingUsingPS {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "jigyasa?allowPublicKeyRetrieval=true",
                    "admin", "Admin@123");

            PreparedStatement stmt = con.prepareStatement("INSERT INTO Students (Roll_number, Name, Father_name, Contact, Address) VALUES (?, ?, ?, ?, ?)");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the roll number");
            int Roll_number = sc.nextInt();
            stmt.setInt(1, Roll_number);
            sc.nextLine(); // Consume the remaining newline character after reading the integer

            System.out.println("Enter the name");
            String n = sc.nextLine();
            stmt.setString(2, n);

            System.out.println("Enter the father name");
            String fname = sc.nextLine();
            stmt.setString(3, fname);

            System.out.println("Enter the contact details");
            int contact = sc.nextInt();
            stmt.setInt(4, contact);
            sc.nextLine(); // Consume the remaining newline character after reading the integer

            System.out.println("Enter the Address");
            String address = sc.nextLine();
            stmt.setString(5, address);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Data insertion failed.");
            }

            stmt.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
