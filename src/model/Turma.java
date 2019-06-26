package model;

public class Turma {


	public Integer getCodTurma() {
		return CodTurma;
	}
	public void setCodTurma(Integer codTurma) {
		CodTurma = codTurma;
	}
	/*public ArrayList<Materia> getMateria() {
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
	}*/
	
	
	public Integer getCodAluno() {
		return CodAluno;
	}
	public void setCodAluno(Integer codAluno) {
		CodAluno = codAluno;
	}
	public Integer getCodProfessor() {
		return CodProfessor;
	}
	public void setCodProfessor(Integer codProfessor) {
		CodProfessor = codProfessor;
	}
	public Integer getCodMateria() {
		return CodMateria;
	}
	public void setCodMateria(Integer codMateria) {
		CodMateria = codMateria;
	}
	private Integer CodTurma;
	private Integer CodAluno;
	private Integer CodProfessor;
	private Integer CodMateria;
	/*private ArrayList<Aluno> Alunos;
	private ArrayList<Professor> professores;
	private ArrayList<Materia> materia;*/
	
}
