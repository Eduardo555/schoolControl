package model;

import java.util.ArrayList;

public class Turma {

	public ArrayList<Aluno> getAlunos() {
		return Alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		Alunos = alunos;
	}
	public Integer getCodTurma() {
		return CodTurma;
	}
	public void setCodTurma(Integer codTurma) {
		CodTurma = codTurma;
	}
	public ArrayList<Materia> getMateria() {
		return materia;
	}
	public void setMateria(ArrayList<Materia> materia) {
		this.materia = materia;
	}
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	
	private Integer CodTurma;
	private ArrayList<Aluno> Alunos;
	private ArrayList<Professor> professores;
	private ArrayList<Materia> materia;
	
}
