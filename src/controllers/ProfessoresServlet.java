package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BdClasses.MateriaBd;
import BdClasses.ProfessorBd;
import model.Materia;
import model.Professor;

@WebServlet(name = "Professores", urlPatterns = "/SalvarProfessores")
public class ProfessoresServlet  extends HttpServlet{

	Professor professor = new Professor();
	ArrayList<Materia> mateliaList = new ArrayList<Materia>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MateriaBd materiaBd = new MateriaBd();
		try {
			mateliaList = materiaBd.CarregarComboboxMaterias();
			
			req.setAttribute("mateliaList", mateliaList);
			RequestDispatcher rd = req.getRequestDispatcher("View/Professores/CadastroProfessores.jsp");
	        rd.forward(req, resp);
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		montarProfessor(req);
		
		if(professor.getCodProfessor().equals(0)) {
			try {
				Salvar();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else {
			Atualizar();
		}
		
	}
	
	private void montarProfessor(HttpServletRequest req) {
		
		professor.setCodProfessor(Integer.parseInt(req.getParameter("TxtCodigo")));
		professor.setNome(req.getParameter("TxtNome"));
		professor.setDataNascimento(req.getParameter("TxtDataNascimento"));
		professor.setDataAdmissao(req.getParameter("TxtDataAdimissao"));
		professor.setSexo(req.getParameter("TxtSexo"));
		professor.setEmail(req.getParameter("TxtEmail"));
		professor.setGrauEscolaridade(req.getParameter("TxtEscolaridade"));
		professor.setTelefone(req.getParameter("TxtTelefone"));
		//professor.setMateria(Integer.parseInt(req.getParameter("TxtMateria")));
	}
	
	private void Salvar() throws SQLException{
		ProfessorBd professorDb = new ProfessorBd();
		professorDb.InserirProfessor(professor);
	}
	
	private void Atualizar() {
		
	}
	
}
