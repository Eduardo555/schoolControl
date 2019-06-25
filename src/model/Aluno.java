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
<<<<<<< HEAD
	private String DataNascimento;
	
=======
	private Date DataNascimento;
	private String Sexo;
	private String Cor;
	private Date DataMatricula;
	private String Status;
	private String Desligamento;
	private Date DataDesligamento;
>>>>>>> 4017c4c810325d67bead47b73e8d856abd9a3cb8
	
}
