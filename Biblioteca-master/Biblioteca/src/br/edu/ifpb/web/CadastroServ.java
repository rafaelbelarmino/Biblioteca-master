package br.edu.ifpb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/CadastroServ")
public class CadastroServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastroServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		HttpSession session = request.getSession(true);

		String titulo = request.getParameter("titulo");
		session.setAttribute("titulo", titulo);
		
		String autor = request.getParameter("autor");
		session.setAttribute("autor", autor);

		String editora = request.getParameter("editora");
		session.setAttribute("editora", editora);

		String anodepublicacao = request.getParameter("anodepublicacao");
		session.setAttribute("anodepublicacao", anodepublicacao);

		String numerodepaginas = request.getParameter("numerodepaginas");
		session.setAttribute("numerodepaginas", numerodepaginas);
		
		RequestDispatcher rd = request.getRequestDispatcher("consulta.jsp");  
        rd.forward(request, response);
		
	}

}