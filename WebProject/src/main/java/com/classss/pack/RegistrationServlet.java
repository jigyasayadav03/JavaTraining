package com.classss.pack;

import com.classss.pack.Registration;
import com.classss.pack.RegisterDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // You can implement doGet if needed, e.g., for displaying a registration form.
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Registration registration = new Registration();
        registration.setname(name);
        registration.setemail(email);
        registration.setpassword(password);

        try {
            int result = RegisterDao.registerStudent(registration);
            if (result > 0) {
                String names = request.getParameter("name");
                request.setAttribute("name", name);

                // Forward the request to the greeting page JSP
                request.getRequestDispatcher("/success.jsp").forward(request, response);
           
                // Registration successful, redirect to a success page
               // response.sendRedirect("success.jsp");
            } else {
                // Registration failed, display an error message on the same page
                request.setAttribute("errorMessage", "Registration failed. Please try again.");
                request.getRequestDispatcher("user.jsp").forward(request, response);
            }
        } catch (Exception e) {
            // Log the exception for debugging purposes (consider using a logging framework)
            e.printStackTrace();

            // Display a user-friendly error message on the same page
            request.setAttribute("errorMessage", "An error occurred during registration.");
            request.getRequestDispatcher("user.jsp").forward(request, response);
        }
    }
}
