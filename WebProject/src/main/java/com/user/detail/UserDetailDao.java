package com.user.detail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDetailDao {


    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jigyasa";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    public static boolean insertUser(UserDetails userDetails) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean success = false;

        try {
            // Establish the database connection
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Define the SQL insert statement
            String sql = "INSERT INTO details (Name, Father_name, Email_id, Contact, Address) VALUES (?, ?, ?, ?, ?)";

            // Create a PreparedStatement with the SQL statement
            preparedStatement = connection.prepareStatement(sql);

            // Set the parameter values using the UserDetails object
            preparedStatement.setString(1, userDetails.getFirstName());
            preparedStatement.setString(2, userDetails.getFatherName());
            preparedStatement.setString(3, userDetails.getEmailId());
            preparedStatement.setString(4, userDetails.getContact());
            preparedStatement.setString(5, userDetails.getAddress());

            // Execute the insert statement
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                success = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the PreparedStatement and Connection
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return success;
    }
}

