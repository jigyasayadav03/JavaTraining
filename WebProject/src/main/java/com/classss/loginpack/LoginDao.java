package com.classss.loginpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/jigyasa";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static boolean validate(Login loginobj) {
        boolean status = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM registration WHERE email = ? AND password = ?")) {

                preparedStatement.setString(1, loginobj.getUsername());
                preparedStatement.setString(2, loginobj.getPassword());
                ResultSet rs = preparedStatement.executeQuery();

                status = rs.next();
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return status;
    }
}
