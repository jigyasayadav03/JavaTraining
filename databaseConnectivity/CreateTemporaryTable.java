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
public class CreateTemporaryTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "jigyasa?allowPublicKeyRetrieval=true", "admin", "Admin@123");
        Statement stmt= conn.createStatement();
       stmt.executeUpdate("CREATE TEMPORARY TABLE temporary (id INT, name VARCHAR(28))");
       stmt.executeUpdate("INSERT INTO temporary values(1,'jigyasa');");
        stmt.executeUpdate("INSERT INTO temporary values(2,'jiya');");
        stmt.executeUpdate("INSERT INTO temporary values(3,'jaya');");
        System.out.println("inserted successfully ");
     ResultSet rs=  stmt.executeQuery("SELECT * FROM temporary;");
       while(rs.next()){
           System.out.println(rs.getInt("id")+"  " +rs.getString("name"));
       }
       
        System.out.println("using where clause");
       rs=  stmt.executeQuery("SELECT * FROM temporary where id=2;");
       while(rs.next()){
           System.out.println(rs.getInt("id")+"  " +rs.getString("name"));
       }
       
       
        System.out.println("after using delete query ");
       stmt.executeUpdate("DELETE FROM temporary where id=3");
       rs=  stmt.executeQuery("SELECT * FROM temporary;");
       while(rs.next()){
           System.out.println(rs.getInt("id")+"  " +rs.getString("name"));
       }
       
       rs.close();
       stmt.close();
        conn.close();
    }
}
