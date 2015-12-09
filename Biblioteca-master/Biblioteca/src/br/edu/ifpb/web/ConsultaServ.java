package br.edu.ifpb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConsultaServlet
 */
@WebServlet("/ConsultaServ")
public class ConsultaServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @param titulo 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String titulo) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		HttpSession session = request.getSession();
		String tituloproc = request.getParameter("tituloproc");
		session.setAttribute("tituloproc", tituloproc);
		session.getAttribute( "titulo" );
		
		if (tituloproc.equals(titulo)){
			PrintWriter out = response.getWriter();

	        // escreve o texto
	        out.println("<html>");
	        out.println("<body>");
	        out.println("Titulo");
	        out.println (tituloproc);
	        out.println("</body>");
	        out.println("</html>");
		
	}else{
		PrintWriter out = response.getWriter();
		out.println("Volume desconhecido");
	}
	}	
}