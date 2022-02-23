package br.com.dominio.controller;

import java.io.IOException;

import br.com.dominio.model.FuncionarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/Controller", "/funcionarios" })
public class FuncionarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FuncionarioController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/funcionarios")) {
			getFuncionarios(request, response);
		}
	}

	protected void getFuncionarios(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("funcionarios.jsp");
	}

}
