package com.user.detail;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/InsertUserServlet")
public class insert extends HttpServlet {
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String firstName = request.getParameter("First_Name");
        String fatherName = request.getParameter("Father_Name");
        String emailId = request.getParameter("Email_Id");
        String contact = request.getParameter("Contact");
        String address = request.getParameter("Address");

        // Create a UserDetails object and set the data
        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName(firstName);
        userDetails.setFatherName(fatherName);
        userDetails.setEmailId(emailId);
        userDetails.setContact(contact);
        userDetails.setAddress(address);

        // Call a method to insert the data into the database (you will need a database connection)
        // Example:
        boolean success = UserDetailDao.insertUser(userDetails);

        // Handle success or failure and redirect accordingly
        if (success) {
            // Redirect to a success page
            response.sendRedirect("main.html");
        } else {
            // Redirect to an error page
            response.sendRedirect("error.jsp");
        }
    }
}

