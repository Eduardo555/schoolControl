package model;

import java.sql.Date;

public class Professor {

	public Integer getCodProfessor() {
		return CodProfessor;
	}
	public void setCodProfessor(Integer codProfessor) {
		CodProfessor = codProfessor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public String getDataAdmissao() {
		return DataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		DataAdmissao = dataAdmissao;
	}
	public String getGrauEscolaridade() {
		return GrauEscolaridade;
	}
	public void setGrauEscolaridade(String grauEscolaridade) {
		GrauEscolaridade = grauEscolaridade;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	private Integer CodProfessor;
	private String Nome;
	private String DataNascimento;
	private String DataAdmissao;
	private String GrauEscolaridade;
	private String Email;
	private String Sexo;
	private String Telefone;
	private Materia materia;
	
}
