package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OiMundo
 */
@WebServlet(urlPatterns = "/OiMundo")
public class OiMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp ) throws IOException {
		
		PrintWriter out = resp.getWriter();
		String nome = req.getParameter("name");
		out.println("<html>");
		out.println("<body>");
		out.println("<p>");
		out.println("Olá mundo dos serverlets, o papai está aqui online. </br>");
		out.println(nome);		
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
