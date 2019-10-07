

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class CustomServlet  extends  HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    response.setCharacterEncoding("UTF-8");

	    PrintWriter writer = response.getWriter(); 
	        writer.println("<!DOCTYPE html><html>");
	        writer.println("<head>");
	        writer.println("<meta charset=\"UTF-8\" />");
	        writer.println("<title>MyServlet.java:doGet(): Servlet code!</title>");
	        writer.println("</head>");
	        writer.println("<body>");

	        writer.println("<h1>This is a simple java servlet.</h1>");

	        writer.println("</body>");
	        writer.println("</html>");
	}
	

}