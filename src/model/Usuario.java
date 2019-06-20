package model;

public class Usuario {

	private Integer CodUsuarios;
	private String Nome;
	private String Senha;
	
	public Integer getCodUsuarios() {
		return CodUsuarios;
	}
	public void setCodUsuarios(Integer codUsuarios) {
		CodUsuarios = codUsuarios;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
}
