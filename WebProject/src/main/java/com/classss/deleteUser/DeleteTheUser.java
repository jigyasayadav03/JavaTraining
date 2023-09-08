package com.classss.deleteUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTheUser {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jigyasa";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    public static boolean deleteUserByEmail(String email) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean success = false;

        try {
            // Establish a database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Define the SQL delete statement
            String sql = "DELETE FROM details WHERE Email_id = ?";

            // Create a PreparedStatement with the SQL statement
            preparedStatement = connection.prepareStatement(sql);

            // Set the parameter value to the email ID
            preparedStatement.setString(1, email);

            // Execute the delete statement
            int rowsDeleted = preparedStatement.executeUpdate();

            if (rowsDeleted > 0) {
                success = true;
            }
        } catch (SQLException | ClassNotFoundException e) {
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
