/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.sql.*;

/**
 *
 * @author jigyasa_yadav
 */
public class InsertingInDatabase {

    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                + "jigyasa?allowPublicKeyRetrieval=true",
                "admin", "Admin@123");
     
 String insertQuery = "INSERT INTO Students (Roll_number, Name, Father_name,Contact,Address) VALUES ('11','jigyasa','himanshu','47453253','indore')";

            // Step 3: Execute the INSERT statement
           Statement statement = conn.createStatement();
           
                int rowsAffected = statement.executeUpdate(insertQuery);
                System.out.println("Rows affected: " + rowsAffected);
          
            statement.close();
   conn.close();
   
        }
  

}
