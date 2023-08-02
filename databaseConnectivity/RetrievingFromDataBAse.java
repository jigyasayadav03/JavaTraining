/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.sql.*;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jigyasa_yadav
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrievingFromDataBAse {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jigyasa?allowPublicKeyRetrieval=true", "admin", "Admin@123");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Students");

            while (rs.next()) {
                System.out.println(rs.getInt("Roll_number")+"  " +rs.getString("Name"));
                        //System.out.println(rs.getString("Roll_number"));
            }

            st.close();
            rs.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
}
