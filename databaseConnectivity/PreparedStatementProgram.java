/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author jigyasa_yadav
 */
public class PreparedStatementProgram {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                + "jigyasa?allowPublicKeyRetrieval=true",
                "admin", "Admin@123");
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM Students_marks where english >? and maths >? and hindi >? and social> ? and science > ? ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks from which you want higher:");
        int marks = sc.nextInt();
        stmt.setInt(1, marks);
        stmt.setInt(2, marks);
        stmt.setInt(3, marks);
        stmt.setInt(4, marks);
        stmt.setInt(5, marks);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt("roll_number") + " " + rs.getInt("english") + " " + rs.getInt("maths") + " " + rs.getInt("hindi") +  " " + rs.getInt("social")+" " + rs.getInt("science"));

        }
        stmt.close();
        con.close();
        

    }
}
