package com.classss.pack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

    public static int registerStudent(Registration registration) {
        String INSERT_USERS_SQL = "INSERT INTO registration" +
            " (name, email, password) VALUES (?, ?, ?)";

        int result = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jigyasa", "root", "root");
            
            // Create a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
            
            // Set parameters
            preparedStatement.setString(1, registration.getname());
            preparedStatement.setString(2, registration.getemail());
            preparedStatement.setString(3, registration.getpassword());

            // Execute the query
            result = preparedStatement.executeUpdate();

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle the exception here or rethrow it
        }
        return result;
    }
}
