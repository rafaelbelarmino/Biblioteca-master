package br.edu.ifpb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String user = "admin";
	private final String pass = "senha";

	public LoginServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");

		if (user.equals(usuario) && pass.equals(senha)) {
			Cookie LoginCookie = new Cookie("usuario", usuario);
			
			LoginCookie.setMaxAge(30 * 60);
			response.addCookie(LoginCookie);
			response.sendRedirect("index.jsp");
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
			PrintWriter out = response.getWriter();
			out.println("<br><font color=red>Usuario ou Senha estão incorretos.</font>");
			rd.include(request, response);
		}

	}

}
