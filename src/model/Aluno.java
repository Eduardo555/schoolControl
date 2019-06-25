package model;

import java.util.Date;


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
	public String getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	private Integer CodAluno;
	private String Nome;
	private String DataNascimento;
	
	
}
