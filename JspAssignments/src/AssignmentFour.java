

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AssignmentFour
 */
@WebServlet("/AssignmentFour")
public class AssignmentFour extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age")); // to get an integer
		
		if(age > 30)
		{
		
			out.println("<body style='background-color:#00ff00;'>");
		}
		else
		{
			out.println("<body style = background-color:ff0000;'>");
		}
	}

}
