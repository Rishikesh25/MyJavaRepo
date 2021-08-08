package com;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	RequestDispatcher rd = null;
		rd=request.getRequestDispatcher("SuccessServlet");
		rd.forward(request, response);
	} else { 
		Object request;
		RequestDispatcher rd = ((ServletRequest) request).getRequestDispatcher("login.html");
	ServletResponse response;
	PrintWriter out = response.getWriter();
	rd.include((ServletRequest) request,response);
	out.println("<center> <span style= 'color:red' >Invalid Credentials!!! </span></center>");
		
	}
	}
}

