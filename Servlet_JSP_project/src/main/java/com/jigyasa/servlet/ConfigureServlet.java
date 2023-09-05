package com.jigyasa.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ConfigureServlet
 */
public class ConfigureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigureServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();	
		String max = context.getInitParameter("max-cart-size");
		
		String name= context.getInitParameter("Project-lead-name");
		
		out.print("<HTML><BODY>");
		out.print("VAlue of max car:"+max+"<br/> The project lead name is "+name);
		out.print("</body></html>");
		
		
		
	}

}