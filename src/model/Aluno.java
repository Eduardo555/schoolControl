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
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public Date getDataDesligamento() {
		return DataDesligamento;
	}
	public void setDataDesligamento(Date dataDesligamento) {
		DataDesligamento = dataDesligamento;
	}
	public Date getDataMatricula() {
		return DataMatricula;
	}
	public void setDataMatricula(Date dataMatricula) {
		DataMatricula = dataMatricula;
	}
	public String getDesligamento() {
		return Desligamento;
	}
	public void setDesligamento(String desligamento) {
		Desligamento = desligamento;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	private Integer CodAluno;
	private String Nome;
	private Date DataNascimento;
	private String Sexo;
	private String Cor;
	private Date DataMatricula;
	private String Status;
	private String Desligamento;
	private Date DataDesligamento;
	
}
