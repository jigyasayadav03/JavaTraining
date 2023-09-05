package com.classss.pack;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// Import Database Connection Class file
import com.classss.pack.*;

// Servlet Name
@WebServlet("/InsertionInTable")


/**
 * Servlet implementation class InsertionInTable
 */
public class InsertionInTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertionInTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
					try {

					// Initialize the database
					Connection con = ConnectionClass.initializeDatabase();

					// Create a SQL query to insert data into demo table
					// demo table consists of two columns, so two '?' is used
					PreparedStatement st = con
						.prepareStatement("insert into registration values(?, ?,?)");

					// For the first parameter,
					// get the data using request object
					// sets the data to st pointer
					st.setString(1, request.getParameter("name"));

					// Same for second parameter
					st.setString(2, request.getParameter("email"));
					st.setString(3, request.getParameter("password"));

					// Execute the insert command using executeUpdate()
					// to make changes in database
					st.executeUpdate();

					// Close all the connections
					st.close();
					con.close();

					// Get a writer pointer
					// to display the successful result
					PrintWriter out = response.getWriter();
					out.println("<html><body><b>Successfully Inserted"
								+ "</b></body></html>");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

	}

