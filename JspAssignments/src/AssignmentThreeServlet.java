

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AssignmentThreeServlet")
public class AssignmentThreeServlet extends HttpServlet 
{
	private final String userid = "admin";
	private final String pass = "admin";

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		String passw = request.getParameter("password");
		
		if(userid.equals(user) && pass.equals(passw))
		{
		   out.println("Login valid");
		}
		
		else
		{
		   out.println("Invalid username and/or password");
		}	
		
		
	}

	
}
