package com.classss.deleteUser;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/DeleteUserServlet")
/**
 * Servlet implementation class DeleteUSerServlet
 */
public class DeleteUSerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUSerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        String email = request.getParameter("email");

		        // Call a method to delete the user based on the email ID (you will need a database connection)
		        // Example:
		         boolean success = DeleteTheUser.deleteUserByEmail(email);

		        // Handle success or failure and redirect accordingly
		        if (success) {
		            // Redirect to a success page
		            response.sendRedirect("DltSuccess.jsp");
		        } else {
		            // Redirect to an error page
		            response.sendRedirect("DltError.jsp");
		        }
		  
}

}
