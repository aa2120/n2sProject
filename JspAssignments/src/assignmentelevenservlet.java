

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class assignmentelevenservlet
 */
@WebServlet("/assignmentelevenservlet")
public class assignmentelevenservlet extends HttpServlet 
{
	private String uname = "admin";
	private String passw = "admin";
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		HttpSession session = request.getSession();
	    Date creationTime = new Date(session.getCreationTime());
	    Date lastAccessed = new Date(session.getLastAccessedTime());
	    Date now = new Date();
	    DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		
		if (uname.equals(user) && passw.equals(pass))
		{
			
			out.println("The session ID is: "+ request.getSession().getId()+"<br>");
			out.println("The creation time is: " + session.getCreationTime()+"<br>");
	        out.println("The session creation time: HttpSession.getCreationTime( ): " + formatter.format(creationTime)+"<br>");
	        out.println("The last time the session was accessed: HttpSession.getLastAccessedTime( ): " + formatter.format(lastAccessed) );
		}
		else
		{
			out.println("Invalid user name or password");
			
		}
		
	}

}
