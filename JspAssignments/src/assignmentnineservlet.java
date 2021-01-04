

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/assignmentnineservlet")
public class assignmentnineservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		int num1 = Integer.parseInt(request.getParameter("number1")); 
		int num2 = Integer.parseInt(request.getParameter("number2")); 
		int result = num1 * num2;
		
		out.println("<H2> The result of multilying " +num1 +" "+ "by" +num2 + " " +"is " +result +"<H/2>");	
	}

}
