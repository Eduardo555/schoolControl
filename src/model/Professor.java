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
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public Date getDataAdmissao() {
		return DataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		DataAdmissao = dataAdmissao;
	}
	public Integer getGrauEscolaridade() {
		return GrauEscolaridade;
	}
	public void setGrauEscolaridade(Integer grauEscolaridade) {
		GrauEscolaridade = grauEscolaridade;
	}
	private Integer CodProfessor;
	private String Nome;
	private Date DataNascimento;
	private Date DataAdmissao;
	private Integer GrauEscolaridade;
	
}
