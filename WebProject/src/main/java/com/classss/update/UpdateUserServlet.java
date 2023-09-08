package com.classss.update;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class UpdateUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String firstName = request.getParameter("First_Name");
        String fatherName = request.getParameter("Father_Name");
        String emailId = request.getParameter("Email_Id");
        String contact = request.getParameter("Contact");
        String address = request.getParameter("Address");

        // Call a method to update the user in the database (you will need a database connection)
        boolean success = updateUserDetails(firstName, fatherName, emailId, contact, address);

        if (success) {
            // Redirect to a success page
            response.sendRedirect("update_success.jsp");
        } else {
            // Redirect to an error page
            response.sendRedirect("update_error.jsp");
        }
    }

    private boolean updateUserDetails(String firstName, String fatherName, String emailId, String contact, String address) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean success = false;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a database connection (replace with your database details)
            String jdbcUrl = "jdbc:mysql://localhost:3306/jigyasa";
            String dbUser = "root";
            String dbPassword = "root";
            connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

            // Define the SQL update statement
            String sql = "UPDAT details SET Name=?, Father_Name=?, Email_Id=?, Contact=?, Address=? WHERE Email_Id=?";

            // Create a PreparedStatement with the SQL statement
            preparedStatement = connection.prepareStatement(sql);

            // Set the parameter values
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, fatherName);
            preparedStatement.setString(3, emailId);
            preparedStatement.setString(4, contact);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, emailId); // Use Email_Id in the WHERE clause

            // Execute the update statement
            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                success = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close resources
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
