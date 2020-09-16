package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.gerenciador.modelo.Banco;
import br.com.caelum.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class NovaEmpresa
 */
@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		String nome = req.getParameter("nome");
		String id = req.getParameter("id");
		String paramDataAbertura = req.getParameter("data");
		
		
		  Date dataAbertura = null; try { SimpleDateFormat sdf = new
		  SimpleDateFormat("dd/MM/yyyy"); dataAbertura = sdf.parse(paramDataAbertura);
		  } catch (ParseException e) { throw new ServletException(e); }
		 	
		Empresa empresa = new Empresa();
		
		empresa.setNome(nome);
		empresa.setId(Integer.parseInt(id));
		empresa.setDataAbertura(dataAbertura); 
		
		Banco banco = new Banco();
		
		banco.adiciona(empresa);
		
		req.setAttribute("empresa", nome);
		
		RequestDispatcher rd = req.getRequestDispatcher("/ListarEmpresa");
		
		
		rd.forward(req, resp);
		
	}

}
