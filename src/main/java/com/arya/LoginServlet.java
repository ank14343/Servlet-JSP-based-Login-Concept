package com.arya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arya.dao.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String uname = request.getParameter("uname");
		System.out.println("::deGet ...");
		
		LoginDao loginDao = new LoginDao();
		
		if(loginDao.doAuthenticate(uname)) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			response.sendRedirect("welcome.jsp");
			System.out.println("after rediect in login servlet......");
			return;
		}
		
		PrintWriter out = response.getWriter();
		out.println("You don't have access to this site.");
		
		
		
	}

}
