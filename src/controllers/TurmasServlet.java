package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BdClasses.TurmasBd;
import model.Aluno;
import model.Materia;
import model.Turma;
import model.Professor;

@WebServlet(urlPatterns = "/Turmas")
public class TurmasServlet extends HttpServlet {

	Turma turma = new Turma();
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		MontarTurma(req);
		
		if(req.getParameter("TxtCodTurma").equals("")) {
			SalvarTurma();
		}
		
		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
	
	private void MontarTurma(HttpServletRequest req) {
		// pegar atributos e monstar objeto.
		turma.setCodTurma(Integer.parseInt(req.getParameter("TxtCodTurma")));
		turma.setCodAluno(Integer.parseInt(req.getParameter("TxtCodAluno")));
		turma.setCodProfessor(Integer.parseInt(req.getParameter("TxtCodProfessor")));
		turma.setCodMateria(Integer.parseInt(req.getParameter("TxtCodMateria")));
		
		/*turma.setAlunos((ArrayList<Aluno>) req.getAttribute("Alunos"));	
		turma.setProfessores((ArrayList<Professor>) req.getAttribute("Professores"));
		turma.setMateria((ArrayList<Materia>) req.getAttribute("Materias"));*/
		
	}
	
	private void SalvarTurma() {
		TurmasBd turmas = new TurmasBd();
		turmas.inserirTurma(turma);
	}
}
