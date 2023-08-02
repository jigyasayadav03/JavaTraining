/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jigyasa_yadav
 */
public class Updatingg {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                + "jigyasa?allowPublicKeyRetrieval=true",
                "admin", "Admin@123");

        String insertQuery = "UPDATE Students_marks SET english=8 where english<7;";

        Statement statement = conn.createStatement();

        int rowsAffected = statement.executeUpdate(insertQuery);
        System.out.println("Rows affected: " + rowsAffected);

        statement.close();
        conn.close();

    }

}
