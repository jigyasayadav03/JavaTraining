package com.classss.loginpack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Login loginobj = new Login();
        loginobj.setUsername(username);
        loginobj.setPassword(password);

        if (LoginDao.validate(loginobj)) {
            String userFullName = getUserFullName(username); // Retrieve user's full name from the database
            HttpSession session = request.getSession();
            session.setAttribute("username", userFullName); // Set the user's full name in the session
            response.sendRedirect("successfull.jsp");
        } else {
            request.setAttribute("error_message", "Invalid username or password");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
    }

    private String getUserFullName(String username) {
        String Name = null;
      final String DB_URL = "jdbc:mysql://localhost:3306/jigyasa";
       final String DB_USER = "root";
        final String DB_PASSWORD = "root";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 PreparedStatement preparedStatement = connection.prepareStatement("SELECT name FROM registration WHERE email = ?")) {

                preparedStatement.setString(1, username);
                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {
                    Name = rs.getString("name");
                } else {
                    // Log an error if no user with the provided username is found
                    System.err.println("User not found for username: " + username);
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Name;
    }
}
