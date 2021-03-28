package com.ti2cc;

public class Usuario {
	private int codigo;
	private String login;
	private String senha;
	private char CPF;
	
	public Usuario() {
		this.codigo = -1;
		this.login = "";
		this.senha = "";
		this.CPF = '*';
	}
	
	public Usuario(int codigo, String login, String senha, char CPF) {
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.CPF = CPF;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public char getCPF() {
		return CPF;
	}

	public void setCPF(char CPF) {
		this.CPF = CPF;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", login=" + login + ", senha=" + senha + ", CPF=" + CPF + "]";
	}
	
}
