package employee.connectivityclass;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeDAO employeeDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        employeeDAO = new EmployeeDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && !action.isEmpty()) {
            if ("insert".equalsIgnoreCase(action)) {
                insertEmployee(request, response);
            } else if ("update".equalsIgnoreCase(action)) {
                updateEmployee(request, response);
            } else if ("delete".equalsIgnoreCase(action)) {
                deleteEmployee(request, response);
            }
        } else {
            // Handle the case where "action" is empty or not recognized
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("view".equals(action)) {
            viewEmployees(request, response);
        } else {
            // Handle other actions or display the employee list as needed
        }
    }

    private void insertEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        Employee newEmployee = new Employee();
        newEmployee.setName(name);
        newEmployee.setEmail(email);

        try {
            employeeDAO.insertEmployee(newEmployee);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("EmployeeServlet?action=view");
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        Employee updatedEmployee = new Employee();
        updatedEmployee.setId(id);
        updatedEmployee.setName(name);
        updatedEmployee.setEmail(email);

        try {
            employeeDAO.updateEmployee(updatedEmployee);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("EmployeeServlet?action=view");
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        try {
            employeeDAO.deleteEmployee(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("EmployeeServlet?action=view");
    }

    private void viewEmployees(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Employee> employees = null;
        try {
            employees = employeeDAO.getAllEmployees();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("employees", employees);
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }
}
