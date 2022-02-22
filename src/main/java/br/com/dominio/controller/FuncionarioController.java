package br.com.dominio.controller;

import java.io.IOException;

import br.com.dominio.model.FuncionarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Controller", "/main"})
public class FuncionarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

	public FuncionarioController() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//Teste de conexão
		funcionarioDAO.testeConexao();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	

}
