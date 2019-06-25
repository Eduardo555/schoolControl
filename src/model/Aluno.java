package model;

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
	public String getDataDesligamento() {
		return DataDesligamento;
	}
	public void setDataDesligamento(String dataDesligamento) {
		DataDesligamento = dataDesligamento;
	}
	public String getDataMatricula() {
		return DataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
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
	private String DataNascimento;
	private String Sexo;
	private String Cor;
	private String DataMatricula;
	private String Status;
	private String Desligamento;
	private String DataDesligamento;



	
}
