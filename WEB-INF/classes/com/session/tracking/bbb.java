package com.session.tracking;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class bbb extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			String name=request.getParameter("name");
			String city=request.getParameter("city");
			System.out.println("Data Arrived");
			System.out.println("Name : "+name);
			System.out.println("City : "+city);
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");

			pw.println("<!DOCTYPE HTML>");
			pw.println("<html lang='en'>");
			pw.println("<head>");
			pw.println("<meta charset='utf-8'>");
			pw.println("<title>Session Tracking using Hidden Form Fields</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("Data Saved<br>");
			pw.println("Name : "+name+"<br>");
			pw.println("City : "+city+"<br>");
			pw.println("<form action='/SessionTracking1/index.html'>");
			pw.println("<button type='submit'>Ok</button>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}