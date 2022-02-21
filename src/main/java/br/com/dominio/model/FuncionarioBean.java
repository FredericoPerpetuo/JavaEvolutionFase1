package br.com.dominio.model;

import java.util.Date;

public class FuncionarioBean {
	private String matricula;
	private String nome;
	private Date dt_admissao;
	private char sexo;
	private String cidade;
	private String uf;
	private String cargo;
	private String cod_dpto;
	
	

	public FuncionarioBean(String matricula, String nome, Date dt_admissao, char sexo, String cidade, String uf,
			String cargo, String cod_dpto) {
		this.matricula = matricula;
		this.nome = nome;
		this.dt_admissao = dt_admissao;
		this.sexo = sexo;
		this.cidade = cidade;
		this.uf = uf;
		this.cargo = cargo;
		this.cod_dpto = cod_dpto;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_admissao() {
		return dt_admissao;
	}

	public void setDt_admissao(Date dt_admissao) {
		this.dt_admissao = dt_admissao;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCod_dpto() {
		return cod_dpto;
	}

	public void setCod_dpto(String cod_dpto) {
		this.cod_dpto = cod_dpto;
	}

}
