package model;

import java.sql.Date;


public class Aluno {

	public Integer getCodAluno() {
		return CodAluno;
	}
	public void setCodAluno(Integer codAluno) {
		CodAluno = codAluno;
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
	private Integer CodAluno;
	private String Nome;
	private Date DataNascimento;
	
	
}
