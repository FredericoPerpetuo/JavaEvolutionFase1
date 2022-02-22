package br.com.dominio.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class FuncionarioDAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/db_gestao_projetos?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "root";

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return con;
		}

	}

	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println("Conexão estabelecida com sucesso: " + con);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
