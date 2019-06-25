package model;

import java.sql.Date;

public class Aula {

	public String getAssunto() {
		return Assunto;
	}
	public void setAssunto(String assunto) {
		Assunto = assunto;
	}
	public String getBimestre() {
		return Bimestre;
	}
	public void setBimestre(String bimestre) {
		Bimestre = bimestre;
	}
	public Integer getCodAula() {
		return CodAula;
	}
	public void setCodAula(Integer codAula) {
		CodAula = codAula;
	} 
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	  public Date getData() {
		return Data;
	}
	public void setData(Date data) {
		Data = data;
	}
	
	private Integer CodAula;
	private Materia materia;
	private String Bimestre;
	private Date Data;
	private String Assunto;
	private Turma turma;
	
}
